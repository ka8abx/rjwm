package com.ssm_rjwm.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ssm_rjwm.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
