package com.liqian.mall.component;

import com.liqian.mall.service.OmsPortalOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 添加取消订单消息的接收者CancelOrderReceiver
 * 用于从取消订单的消息队列（mall.order.cancel）里接收消息。
 *
 * @author administrator
 */
@Component
@RabbitListener(queues = "mall.order.cancel")
@Slf4j
public class CancelOrderReceiver {

    @Resource
    private OmsPortalOrderService portalOrderService;
    @RabbitHandler
    public void handle(Long orderId){
        log.info("mall.order.cancel收到消息 orderId:{}",orderId);
        portalOrderService.cancelOrder(orderId);
    }
}
