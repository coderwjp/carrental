package com.hgcd.carrental.mapper;

import com.hgcd.carrental.model.BizFee;

public interface BizFeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BizFee record);

    int insertSelective(BizFee record);

    BizFee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BizFee record);

    int updateByPrimaryKey(BizFee record);
}