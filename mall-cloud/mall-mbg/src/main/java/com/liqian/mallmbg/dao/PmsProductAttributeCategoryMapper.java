package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.PmsProductAttributeCategory;

public interface PmsProductAttributeCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttributeCategory record);

    int insertSelective(PmsProductAttributeCategory record);

    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    int updateByPrimaryKey(PmsProductAttributeCategory record);
}