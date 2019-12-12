package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.SmsHomeAdvertise;

public interface SmsHomeAdvertiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeAdvertise record);

    int insertSelective(SmsHomeAdvertise record);

    SmsHomeAdvertise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    int updateByPrimaryKey(SmsHomeAdvertise record);
}