package com.demo.persist.impl;

import com.demo.domain.Test;
import com.demo.persist.TestDao;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class TestDaoImpl implements TestDao {

    @Resource
    private HibernateTemplate hibernateTemplate;

    public void testDao() {
        System.out.println("123木头人!");

    }
}
