package com.ssm_rjwm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm_rjwm.entity.Employee;
import com.ssm_rjwm.mapper.EmployeeMapper;
import com.ssm_rjwm.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
