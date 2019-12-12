package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.UmsMemberLoginLog;

public interface UmsMemberLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberLoginLog record);

    int insertSelective(UmsMemberLoginLog record);

    UmsMemberLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    int updateByPrimaryKey(UmsMemberLoginLog record);
}