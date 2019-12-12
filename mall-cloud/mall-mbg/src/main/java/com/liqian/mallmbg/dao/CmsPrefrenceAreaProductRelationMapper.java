package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.CmsPrefrenceAreaProductRelation;

public interface CmsPrefrenceAreaProductRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsPrefrenceAreaProductRelation record);

    int insertSelective(CmsPrefrenceAreaProductRelation record);

    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}