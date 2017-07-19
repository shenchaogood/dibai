package com.wuwutong.dibai.mapper;

import com.wuwutong.dibai.po.SmsTemplate;
import com.wuwutong.dibai.po.SmsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsTemplateMapper {
    long countByExample(SmsTemplateExample example);

    int deleteByExample(SmsTemplateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SmsTemplate record);

    int insertSelective(SmsTemplate record);

    List<SmsTemplate> selectByExample(SmsTemplateExample example);

    SmsTemplate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SmsTemplate record, @Param("example") SmsTemplateExample example);

    int updateByExample(@Param("record") SmsTemplate record, @Param("example") SmsTemplateExample example);

    int updateByPrimaryKeySelective(SmsTemplate record);

    int updateByPrimaryKey(SmsTemplate record);
}