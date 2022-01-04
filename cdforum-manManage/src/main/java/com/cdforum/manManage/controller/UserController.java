package com.cdforum.manManage.controller;

import com.cdforum.manManage.entities.userEntities.Users;
import com.cdforum.manManage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
	@Autowired
	private UserService service;
	@Autowired
	private DiscoveryClient client;

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Users dept)
	{
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Users get(@PathVariable("id") Long id)
	{
		return service.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Users> list()
	{
		return service.list();
	}

	
//	@Autowired
//	private DiscoveryClient client;
//	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
//	public Object discovery()
//	{
//		List<String> list = client.getServices();
//		System.out.println("**********" + list);
//
//		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
//		for (ServiceInstance element : srvList) {
//			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
//					+ element.getUri());
//		}
//		return this.client;
//	}

}
