package com.wuwutong.dibai.mapper;

import com.wuwutong.dibai.po.SmsIdentify;
import com.wuwutong.dibai.po.SmsIdentifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsIdentifyMapper {
    long countByExample(SmsIdentifyExample example);

    int deleteByExample(SmsIdentifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsIdentify record);

    int insertSelective(SmsIdentify record);

    List<SmsIdentify> selectByExample(SmsIdentifyExample example);

    SmsIdentify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsIdentify record, @Param("example") SmsIdentifyExample example);

    int updateByExample(@Param("record") SmsIdentify record, @Param("example") SmsIdentifyExample example);

    int updateByPrimaryKeySelective(SmsIdentify record);

    int updateByPrimaryKey(SmsIdentify record);
}