package com.liqian.mallmbg.dao;

import com.liqian.mallmbg.entity.SmsFlashPromotionLog;

public interface SmsFlashPromotionLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SmsFlashPromotionLog record);

    int insertSelective(SmsFlashPromotionLog record);

    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    int updateByPrimaryKey(SmsFlashPromotionLog record);
}