package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.SmsCouponHistory;

public interface SmsCouponHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponHistory record);

    int insertSelective(SmsCouponHistory record);

    SmsCouponHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponHistory record);

    int updateByPrimaryKey(SmsCouponHistory record);
}