package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.CmsMemberReport;

public interface CmsMemberReportMapper {
    int insert(CmsMemberReport record);

    int insertSelective(CmsMemberReport record);
}