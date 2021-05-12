//获取系统时间
package com.Backend.java;

import java.util.*;
import java.text.*;
public class GetTime {
	//获取格式为 月-日-小时-分钟 的时间
	public String GetSystemTime(){
		var init_GetSystemTime = new Date();
		var ft = new SimpleDateFormat("MM-dd-hh-mm");
		return ft.format(init_GetSystemTime);
	}
   public String GetDate(){
      //获取系统日期
      var init_Date = new Date();
      var ft = new SimpleDateFormat("MM-dd");
      return ft.format(init_Date);
   }
   public String GetHour(){
      //获取系统小时
      var init_Hour = new Date();
      var ft = new SimpleDateFormat("hh");
      return ft.format(init_Hour);
   }
   public String GetMin(){
      //获取系统分钟
      var init_Min = new Date();
      var ft = new SimpleDateFormat("mm");
      return ft.format(init_Min);
   }
}
