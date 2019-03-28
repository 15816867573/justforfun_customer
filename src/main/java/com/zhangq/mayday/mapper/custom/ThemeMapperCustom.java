package com.zhangq.mayday.mapper.custom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "provider")
public interface ThemeMapperCustom {
@RequestMapping(value = "/theme/updateStatus")
@ResponseBody
	void updateStatus(@RequestParam(value = "status") int status, @RequestParam(value = "id") int id);

}
