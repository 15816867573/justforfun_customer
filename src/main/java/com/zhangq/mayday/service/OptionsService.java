package com.zhangq.mayday.service;

import com.zhangq.mayday.model.domain.Options;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
import java.util.Map;

public interface OptionsService {
	/**
	 * 保存多个
	 * 
	 * @param map
	 */
	void save(Map<String, String> map) throws Exception;

	/**
	 * 所有设置选项
	 * 
	 * @return
	 */
	List<Options> selectMap();

	/**
	 * 保存单个
	 * 
	 * @param key
	 * @param value
	 */
	void saveOption(String key, String value);

	/**
	 * 删除
	 * 
	 * @param options
	 */
	void delete(Options options) throws Exception;

}
