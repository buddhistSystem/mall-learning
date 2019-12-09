package com.liqian.mall.service;

import com.liqian.mall.dto.OrderParam;
import com.liqian.mall.util.Result;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: Administrator
 * @Date: 2019/12/6 0006 14:30
 * @Description: 前台订单管理Service
 */
public interface OmsPortalOrderService {

    /**
     * 根据提交信息生成订单
     */
    @Transactional
    Result generateOrder(OrderParam orderParam);

    /**
     * 取消单个超时订单
     */
    @Transactional
    void cancelOrder(Long orderId);
}
