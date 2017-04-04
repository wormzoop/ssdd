package com.zoop.controller;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Value("${my-config.appName}")
	private String appName; 
	
	@RequestMapping(value = "/test")
	@ResponseBody
	public String test(){
		System.out.println("==============="+appName);
		return appName;
	}
	
	@RequestMapping(value = "/discovery")
	@ResponseBody
	public String discoveryService(){
		StringBuilder stringBuilder = new StringBuilder();
		List<String> servicesId = discoveryClient.getServices();
		if(!CollectionUtils.isEmpty(servicesId)){
			for(String s : servicesId){
				System.out.println("servicesId:"+s);
				stringBuilder.append("servicesId:"+s+"<br/>");
				List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances(s);
				if(!CollectionUtils.isEmpty(serviceInstanceList)){
					for(ServiceInstance si : serviceInstanceList){
						stringBuilder.append("serviceId: "+si.getServiceId()+" host: "+si.getHost()+" port: "+si.getPort()+" uri: "+si.getUri()+"<br/>");
					}
				}else{
					stringBuilder.append("no serviceInstance"+"<br/>");
				}
			}
		}
		return stringBuilder.toString();
	}
	
}
