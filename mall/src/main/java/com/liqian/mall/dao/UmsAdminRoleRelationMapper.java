package com.liqian.mall.dao;

import com.liqian.mall.entity.UmsAdminRoleRelation;
import com.liqian.mall.entity.UmsPermission;

import java.util.List;

public interface UmsAdminRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminRoleRelation record);

    int insertSelective(UmsAdminRoleRelation record);

    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    int updateByPrimaryKey(UmsAdminRoleRelation record);

    List<UmsPermission> getPermissionList(Long adminId);
}