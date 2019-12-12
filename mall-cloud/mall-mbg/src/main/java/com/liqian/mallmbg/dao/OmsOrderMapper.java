package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.OmsOrder;

public interface OmsOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);
}