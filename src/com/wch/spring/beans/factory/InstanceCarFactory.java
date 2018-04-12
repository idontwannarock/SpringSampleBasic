package com.wch.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 實例工廠方法：實例工廠的方法，即需要創建工廠本身，再調用工廠的實例方法來返回bean的實例
 * @author wangchenghao
 *
 */
public class InstanceCarFactory {

	private Map<String, Car> cars = null;
	
	public InstanceCarFactory() {
		cars = new HashMap<>();
		cars.put("Audi", new Car("Audi", 1500000));
		cars.put("Ford", new Car("Ford", 2000000));
	}
	
	public Car getCar(String brand) {
		return cars.get(brand);
	}
}
