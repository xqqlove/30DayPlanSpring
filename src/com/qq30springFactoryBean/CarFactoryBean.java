package com.qq30springFactoryBean;

import org.springframework.beans.factory.FactoryBean;
//自定义的FactoryBean需要实现FactoryBean接口
public class CarFactoryBean implements FactoryBean<Car> {
    @Override

    public Car getObject() throws Exception {
        return new Car("BMW" ,500000);
    }
   //
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
