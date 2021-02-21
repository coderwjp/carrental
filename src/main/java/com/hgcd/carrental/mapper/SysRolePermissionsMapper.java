package com.hgcd.carrental.mapper;

import com.hgcd.carrental.model.SysRolePermissions;

public interface SysRolePermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRolePermissions record);

    int insertSelective(SysRolePermissions record);

    SysRolePermissions selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRolePermissions record);

    int updateByPrimaryKey(SysRolePermissions record);
}