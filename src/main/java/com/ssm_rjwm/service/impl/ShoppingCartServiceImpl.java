package com.ssm_rjwm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm_rjwm.entity.ShoppingCart;
import com.ssm_rjwm.mapper.ShoppingCartMapper;
import com.ssm_rjwm.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {

}
