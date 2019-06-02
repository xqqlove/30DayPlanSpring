package com.qq30springAnnotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserjdbcRepository implements UserRepository {

    @Override
    public void save() {
        System.out.println("UserJdbcRepository save....");
    }
}
