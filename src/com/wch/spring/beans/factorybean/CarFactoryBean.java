package com.wch.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

// 自定義的FactoryBean需要實作FactoryBean介面
public class CarFactoryBean implements FactoryBean<Car> {
	
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	// 返回bean的對象
	@Override
	public Car getObject() throws Exception {
		return new Car(brand, 2500000);
	}

	// 返回bean的類型
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
