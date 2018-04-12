package com.wch.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 靜態工廠方法：直接調用某一個類別的靜態方法，就可以返回bean的實例
 * @author wangchenghao
 *
 */
public class StaticCarFactory {

	private static Map<String, Car> cars = new HashMap<>();
	
	static {
		cars.put("Audi", new Car("Audi", 1500000));
		cars.put("Ford", new Car("Ford", 2000000));
	}
	
	// 靜態工廠方法
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
