package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.CmsTopicComment;

public interface CmsTopicCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsTopicComment record);

    int insertSelective(CmsTopicComment record);

    CmsTopicComment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsTopicComment record);

    int updateByPrimaryKey(CmsTopicComment record);
}