package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.UmsIntegrationChangeHistory;

public interface UmsIntegrationChangeHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsIntegrationChangeHistory record);

    int insertSelective(UmsIntegrationChangeHistory record);

    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}