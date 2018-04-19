package com.gcc.service.impl;

import com.gcc.service.DemoProviderService;

/**
 * 发布接口实现
 * @author gcc
 *
 */
public class DemoProviderServiceImpl implements DemoProviderService{

	public String sayHello(String name) {
		return "this is server 001";
	}

}
