package com.hgcd.carrental.mapper;

import com.hgcd.carrental.model.SysDepartment;

public interface SysDepartmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDepartment record);

    int insertSelective(SysDepartment record);

    SysDepartment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDepartment record);

    int updateByPrimaryKey(SysDepartment record);
}