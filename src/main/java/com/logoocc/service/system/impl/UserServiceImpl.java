package com.logoocc.service.system.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.logoocc.mapper.system.UserMapper;
import com.logoocc.model.system.User;
import com.logoocc.service.system.IUserService;

/**
 *
 * User 表数据服务层接口实现类
 *
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {


}