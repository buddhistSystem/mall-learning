package com.liqian.mall.service;

import com.liqian.mall.util.Result;

/**
 * @Author: Administrator
 * @Date: 2019/12/2 0002 09:28
 * @Description:
 */
public interface UmsMemberService {

    /**
     * 生成验证码
     */
    Result generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    Result verifyAuthCode(String telephone, String authCode);
}
