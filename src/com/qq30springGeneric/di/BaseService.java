package com.qq30springGeneric.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BaseService <T>{
    @Autowired
    protected BaseRepository<T> repository;

    public void add(){
        System.out.println("add.....");
        System.out.println("repository");
    }
}
