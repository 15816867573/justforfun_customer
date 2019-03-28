package com.zhangq.mayday.mapper.custom;

import com.zhangq.mayday.model.domain.Options;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
@FeignClient(name = "provider")
public interface OptionsMapperCustom {
	/**
	 * 保存
	 * 
	 * @param map
	 */
	@RequestMapping(value = "/options/saveMap")
	@ResponseBody
	void saveMap(@RequestBody Map<String, Object> map);

	/**
	 * 所有设置选项
	 * 
	 * @return map
	 */
	@RequestMapping(value = "/options/selectMap")
	@ResponseBody
	List<Options> selectMap();

}
