package com.example.demo6.service;

import com.example.demo6.dao.TestDao;
import com.example.demo6.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao =null;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }

}
