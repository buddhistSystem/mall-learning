package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.PmsAlbum;

public interface PmsAlbumMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbum record);

    int insertSelective(PmsAlbum record);

    PmsAlbum selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbum record);

    int updateByPrimaryKey(PmsAlbum record);
}