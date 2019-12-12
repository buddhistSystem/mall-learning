package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.SmsCouponProductCategoryRelation;

public interface SmsCouponProductCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SmsCouponProductCategoryRelation record);

    int insertSelective(SmsCouponProductCategoryRelation record);

    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);
}