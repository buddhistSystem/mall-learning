package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.PmsProductVertifyRecord;

public interface PmsProductVertifyRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecord record);

    int insertSelective(PmsProductVertifyRecord record);

    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    int updateByPrimaryKey(PmsProductVertifyRecord record);
}