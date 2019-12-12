package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.SmsHomeNewProduct;

public interface SmsHomeNewProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsHomeNewProduct record);

    int insertSelective(SmsHomeNewProduct record);

    SmsHomeNewProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    int updateByPrimaryKey(SmsHomeNewProduct record);
}