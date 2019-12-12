package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.PmsComment;

public interface PmsCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsComment record);

    int insertSelective(PmsComment record);

    PmsComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsComment record);

    int updateByPrimaryKeyWithBLOBs(PmsComment record);

    int updateByPrimaryKey(PmsComment record);
}