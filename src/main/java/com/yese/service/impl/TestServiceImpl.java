package com.yese.service.impl;

import com.yese.mapper.TestMapper;
import com.yese.pojo.User;
import com.yese.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<User> getUsers() {
        return testMapper.getUsers();
    }
}
