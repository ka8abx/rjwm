package com.ssm_rjwm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ssm_rjwm.entity.DishFlavor;
import com.ssm_rjwm.mapper.DishFlavorMapper;
import com.ssm_rjwm.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
