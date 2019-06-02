package com.qq30springAnnotation.repository;

import com.qq30springAnnotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepository Save....");
        System.out.println(testObject);
    }
}
