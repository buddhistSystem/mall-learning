package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.UmsMemberRuleSetting;

public interface UmsMemberRuleSettingMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberRuleSetting record);

    int insertSelective(UmsMemberRuleSetting record);

    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    int updateByPrimaryKey(UmsMemberRuleSetting record);
}