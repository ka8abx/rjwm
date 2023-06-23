package com.ssm_rjwm.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ssm_rjwm.entity.AddressBook;
import com.ssm_rjwm.mapper.AddressBookMapper;
import com.ssm_rjwm.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
