package com.hgcd.carrental.mapper;

import com.hgcd.carrental.model.SysUserCar;

public interface SysUserCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserCar record);

    int insertSelective(SysUserCar record);

    SysUserCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUserCar record);

    int updateByPrimaryKey(SysUserCar record);
}