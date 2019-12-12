package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.OmsOrderOperateHistory;

public interface OmsOrderOperateHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);
}