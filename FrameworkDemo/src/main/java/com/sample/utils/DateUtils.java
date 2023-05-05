package com.sample.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	/************** Get time stamp in format: yyyy.MM.dd.HH.mm.ss ****************/
	public static String getTimeStamp(){
		return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	}
}
