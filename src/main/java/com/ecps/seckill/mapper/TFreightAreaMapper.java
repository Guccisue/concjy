package com.ecps.seckill.mapper;

import com.ecps.seckill.pojo.TFreightArea;

public interface TFreightAreaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TFreightArea record);

    int insertSelective(TFreightArea record);

    TFreightArea selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TFreightArea record);

    int updateByPrimaryKey(TFreightArea record);
}