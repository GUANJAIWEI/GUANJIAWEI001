package com.example.demo6.enumeration;

import com.example.demo6.converter.SexConverter;
import com.example.demo6.entity.User;
import org.junit.jupiter.api.Test;

public class SexEnumTest {

    @Test
    void testSexEnum(){
        System.out.println("------开始-----");
        User user = new User();
        SexConverter sexConverter;
        sexConverter = new SexConverter();

//        输入参数
        user.setId((long) 1);
        user.setNote("TEST");
        user.setSex(sexConverter.convertToEntityAttribute(1));
        user.setUserName("guan");

       System.out.println(user.getSex().getName());
        System.out.println(user.getSex());


    }
}
