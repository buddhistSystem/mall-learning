package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.UmsMemberLevel;

public interface UmsMemberLevelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLevel record);

    int insertSelective(UmsMemberLevel record);

    UmsMemberLevel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLevel record);

    int updateByPrimaryKey(UmsMemberLevel record);
}