package com.zhangq.mayday.mapper.custom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "provider")
public interface LogMapperCustom {
@RequestMapping(value = "/log/clear")
	void clear();

}
