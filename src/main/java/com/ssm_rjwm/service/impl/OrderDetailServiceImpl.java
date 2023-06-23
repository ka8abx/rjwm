package com.ssm_rjwm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ssm_rjwm.entity.OrderDetail;
import com.ssm_rjwm.mapper.OrderDetailMapper;
import com.ssm_rjwm.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}