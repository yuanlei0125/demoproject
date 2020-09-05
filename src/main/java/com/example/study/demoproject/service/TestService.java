package com.example.study.demoproject.service;

import com.example.study.demoproject.dao.TestDao;
import com.example.study.demoproject.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}