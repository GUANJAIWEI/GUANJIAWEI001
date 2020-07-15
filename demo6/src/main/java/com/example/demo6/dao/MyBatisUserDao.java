package com.example.demo6.dao;

import com.example.demo6.entity.User;
import org.springframework.stereotype.Repository;

/**** imports ****/
public interface MyBatisUserDao {
     User getUser(Long id);
}