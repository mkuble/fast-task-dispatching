package com.fast.task.dispatching.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fast.task.dispatching.dao.AdminRepository;

/**
 * 管理员业务处理
 * 
 * @author lion.chen
 * @version 1.0.0 2017年12月21日 下午6:42:29
 */
@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
}
