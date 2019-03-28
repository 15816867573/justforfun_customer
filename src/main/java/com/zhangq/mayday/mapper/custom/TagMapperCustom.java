package com.zhangq.mayday.mapper.custom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@FeignClient(name = "provider")
public interface TagMapperCustom {
@RequestMapping(value = "/tag/selectByarticleId")
	List<Integer> selectByarticleId(@RequestParam("id") Integer id);
	@RequestMapping(value = "/tag/delete")
	@ResponseBody
	void delete(@RequestBody List<Integer> tagList, @RequestParam(value = "articleId") Integer articleId);

}
