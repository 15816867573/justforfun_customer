package com.zhangq.mayday.mapper.custom;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "provider")
public interface LinkMapperCustom {

}