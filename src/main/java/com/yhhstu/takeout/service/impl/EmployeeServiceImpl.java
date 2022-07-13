package com.yhhstu.takeout.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yhhstu.takeout.entity.Employee;
import com.yhhstu.takeout.mapper.EmployeeMapper;
import com.yhhstu.takeout.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author: YHH
 * @version: 1.0
 **/

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
