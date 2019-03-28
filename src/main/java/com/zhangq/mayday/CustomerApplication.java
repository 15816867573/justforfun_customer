package com.zhangq.mayday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

//@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
//@ComponentScan("com.zhangq.mayday.mapper")
public class CustomerApplication {
  /*  @Bean
    @LoadBalanced
    //实现负载均衡
    RestTemplate restTemplate() {
        return new RestTemplate();
    }*/

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

}
