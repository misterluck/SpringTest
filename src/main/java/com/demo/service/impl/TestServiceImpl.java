package com.demo.service.impl;

import com.demo.persist.TestDao;
import com.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "TestService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    public void testService() {
        testDao.testDao();
    }
}
