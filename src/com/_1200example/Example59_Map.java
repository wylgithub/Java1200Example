package com._1200example;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Example59_Map {
	//实例化map数据
	public static Map<String, String[]> model = new LinkedHashMap();
	//数理化Map数据
	static{
		model.put("北京", new String[]{"北京"});
		model.put("上海", new String[]{"上海"});
		model.put("天津", new String[]{"天津"});
		model.put("重庆", new String[]{"重庆"});
		model.put("云南", new String[]{"昆明","昭通","丽江","曲靖","香格里拉","土耳其"});
		model.put("四川", new String[]{"泸州","成都","黄果树"});
		model.put("贵州", new String[]{"贵阳","毕节","遵义"});
	}
	//编写获取省份方法
	public static  Object[] getProvince(){
		Map<String,String[]> map = Example59_Map.model;
		//将键值存放在Set集合中
		Set<String> set = map.keySet();
		//将键值转换为数组
		Object [] province = set.toArray();
		//返回省份
		return province;
	}
	//根据返回的省份信息:返回属于该省的所有城市
	public static String[] getCity(String selectProvince){
		Map <String, String[]> map = Example59_Map.model;
		//获取指定键的值
		String [] citys = map.get(selectProvince);
		return citys;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//获得城市数组
		Example59_Map map = new Example59_Map();
		Object[] pro = map.getProvince();
		System.out.println("打印省份的个数: "+pro.length);
		//打印城市的个数:
		
//		System.out.println("获得上海市对应的城市个数: "+citys.length);
		System.out.println("请输入你要了解的省份对应的城市: ");
		Scanner console = new Scanner(System.in);
		String prov = console.nextLine();
		String citys[] = map.getCity(prov);
		//循环打印城市
		for(String s: citys){
			System.out.println("省份 "+prov+" 对应的城市有: "+ s);
		}
	}

}
