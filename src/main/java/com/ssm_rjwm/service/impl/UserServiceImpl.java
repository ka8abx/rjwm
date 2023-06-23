package com.ssm_rjwm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ssm_rjwm.entity.User;
import com.ssm_rjwm.mapper.UserMapper;
import com.ssm_rjwm.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
