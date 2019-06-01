package com.qq30SpringFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法：直接调用某一类的静态方法就能返回besan的实例
 */
public class StaticCarFactory {
    private static Map<String, Car> cars=new HashMap<String,Car>();

    static {
        cars.put("audi",new Car("AUDI",300000));
        cars.put("ford",new Car("ford",400000));
    }
//    静态工厂方法
    public static Car getCar(String name){
        return cars.get(name);
    }
}
