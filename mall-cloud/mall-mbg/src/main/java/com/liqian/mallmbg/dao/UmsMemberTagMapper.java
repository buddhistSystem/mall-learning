package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.UmsMemberTag;

public interface UmsMemberTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);
}