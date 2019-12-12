package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.PmsAlbumPic;

public interface PmsAlbumPicMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PmsAlbumPic record);

    int insertSelective(PmsAlbumPic record);

    PmsAlbumPic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PmsAlbumPic record);

    int updateByPrimaryKey(PmsAlbumPic record);
}