package com.hgcd.carrental.mapper;

import com.hgcd.carrental.model.BizCar;

public interface BizCarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizCar record);

    int insertSelective(BizCar record);

    BizCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BizCar record);

    int updateByPrimaryKey(BizCar record);
}