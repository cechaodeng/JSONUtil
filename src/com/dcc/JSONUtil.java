package com.dcc;

import java.util.List;

import net.sf.json.JSONArray;

public class JSONUtil {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "[{\"wayCode\":\"TSZ_44\",\"segCode\":\"2017Q1\",\"dimNo\":\"01\",\"orgNo\":\"04405\"},{\"wayCode\":\"TSZ_43\",\"segCode\":\"2017Q1\",\"dimNo\":\"01\",\"orgNo\":\"04406\"}]";
		//JSONObject jsonObj = new JSONObject();
		JSONArray jsonObj = JSONArray.fromObject(str);
		List<Object> objs = (List<Object>)JSONArray.toCollection(jsonObj);
		System.out.println(objs.get(0));
		
	}
}
