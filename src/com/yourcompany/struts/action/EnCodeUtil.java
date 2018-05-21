package com.yourcompany.struts.action;

import java.io.UnsupportedEncodingException;

public class EnCodeUtil {
	public static String enCode(String s){
		try {
			s = new String(s.getBytes("ISO-8859-1"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
	}
}
