package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Log;
import com.zhangq.mayday.model.domain.LogExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface LogMapper {
	@RequestMapping(value = "/log/countByExample")
	long countByExample(LogExample example);
	@RequestMapping(value = "/log/deleteByExample")
	int deleteByExample(LogExample example);
	@RequestMapping(value = "/log/deleteByPrimaryKey")
	int deleteByPrimaryKey(@RequestParam("logId") Integer logId);
	@RequestMapping(value = "/log/insert")
	int insert(Log record);
	@RequestMapping(value = "/log/insertSelective")
	int insertSelective(Log record);
	@RequestMapping(value = "/log/selectByExample")
	List<Log> selectByExample(LogExample example);
	@RequestMapping(value = "/log")
	Log selectByPrimaryKey(@RequestParam("logId")Integer logId);
	@RequestMapping(value = "/log/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Log record, @RequestParam("orderByClause") LogExample example);
	@RequestMapping(value = "/log/updateByExample")
	int updateByExample(@RequestBody Log record, @RequestParam("orderByClause") LogExample example);
	@RequestMapping(value = "/log/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Log record);
	@RequestMapping(value = "/log/updateByPrimaryKey")
	int updateByPrimaryKey(Log record);
}