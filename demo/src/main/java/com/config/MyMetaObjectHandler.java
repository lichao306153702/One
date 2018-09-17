package com.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

//@Component
public class MyMetaObjectHandler  extends MetaObjectHandler {
    /**
     * 测试 user 表 name 字段为空自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        // 更多查看源码测试用例
        System.out.println("*************************");
        System.out.println("insert fill");
        System.out.println("*************************");

        // 测试下划线
        Object testType = getFieldValByName("testType", metaObject);//mybatis-plus版本2.0.9+
        System.out.println("testType=" + testType);
        if (testType == null) {
            setFieldValByName("testType", 3, metaObject);//mybatis-plus版本2.0.9+
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        //更新填充
        System.out.println("*************************");
        System.out.println("update fill");
        System.out.println("*************************");
        //mybatis-plus版本2.0.9+
        setFieldValByName("lastUpdatedDt", new Timestamp(System.currentTimeMillis()), metaObject);
    }
}
