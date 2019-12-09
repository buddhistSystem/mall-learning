package com.liqian.mall.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.liqian.mall.enumerate.ResultEnum;
import com.liqian.mall.service.RedisService;
import com.liqian.mall.service.UmsMemberService;
import com.liqian.mall.util.Result;
import com.liqian.mall.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author: Administrator
 * @Date: 2019/12/2 0002 09:28
 * @Description:
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    private RedisService redisService;
    @Value("${redis.key.prefix.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.key.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public Result generateAuthCode(String telephone) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        //验证码绑定手机号并存储到redis
        redisService.set(REDIS_KEY_PREFIX_AUTH_CODE + telephone, sb.toString());
        redisService.expire(REDIS_KEY_PREFIX_AUTH_CODE + telephone, AUTH_CODE_EXPIRE_SECONDS);
        return ResultUtil.success(sb.toString());
    }

    @Override
    public Result verifyAuthCode(String telephone, String authCode) {
        if (StringUtils.isEmpty(authCode)) {
            return ResultUtil.error(ResultEnum.PARAM_ERROR.getCode(), "请输入验证码");
        }
        String realAuthCode = redisService.get(REDIS_KEY_PREFIX_AUTH_CODE + telephone);
        boolean result = authCode.equals(realAuthCode);
        if (result) {
            return ResultUtil.success();
        } else {
            return ResultUtil.error(ResultEnum.PARAM_ERROR.getCode(), "验证码不正确");
        }
    }
}
