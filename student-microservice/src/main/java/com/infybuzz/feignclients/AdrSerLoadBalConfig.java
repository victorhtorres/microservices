package com.infybuzz.feignclients;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;

import feign.Feign;

@LoadBalancerClient(value = "address-service")
public class AdrSerLoadBalConfig {

	@LoadBalanced
	@Bean
	public Feign.Builder feignBuilder () {
		return Feign.builder();
	}
	
}
