package com.example.study.demoproject.dao;

import com.example.study.demoproject.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}