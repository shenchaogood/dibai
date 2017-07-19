package com.wuwutong.dibai.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public abstract class DateTimeUtil {
	
	public static String format(long timestamp,String pattern){
		return new DateTime(timestamp).toString(pattern);
	}
	
	public static String formatCommon (long timestamp){
		return new DateTime(timestamp).toString("yyyyMMdd HH:mm:ss");
	}
	
	public static Date parseDate(String date,String pattern){
		try {
			return new SimpleDateFormat(pattern).parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

}
