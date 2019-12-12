package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.UmsMemberMemberTagRelation;

public interface UmsMemberMemberTagRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberMemberTagRelation record);

    int insertSelective(UmsMemberMemberTagRelation record);

    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}