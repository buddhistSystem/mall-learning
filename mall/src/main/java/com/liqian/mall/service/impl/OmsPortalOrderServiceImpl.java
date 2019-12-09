package com.liqian.mall.service.impl;

import com.liqian.mall.component.CancelOrderSender;
import com.liqian.mall.dto.OrderParam;
import com.liqian.mall.service.OmsPortalOrderService;
import com.liqian.mall.util.Result;
import com.liqian.mall.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Administrator
 * @Date: 2019/12/6 0006 14:32
 * @Description:
 */
@Service
@Slf4j
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {

    @Resource
    private CancelOrderSender cancelOrderSender;

    @Override
    public Result generateOrder(OrderParam orderParam) {
        //todo 执行一系类下单操作，具体参考mall项目
        log.info("开始生成订单");
        //下单完成后开启一个延迟消息，用于当用户没有付款时取消订单（orderId应该在下单后生成）
        sendDelayMessageCancelOrder(11L);
        return ResultUtil.success();
    }

    @Override
    public void cancelOrder(Long orderId) {
        //todo 执行一系类取消订单操作，具体参考mall项目
        log.info("取消订单 orderId:{}",orderId);
    }

    private void sendDelayMessageCancelOrder(Long orderId) {
        //获取订单超时时间，假设为60分钟
        long delayTimes = 20 * 1000;
        //发送延迟消息
        cancelOrderSender.sendMessage(orderId, delayTimes);
    }
}
