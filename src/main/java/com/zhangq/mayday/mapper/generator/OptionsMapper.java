package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Options;
import com.zhangq.mayday.model.domain.OptionsExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface OptionsMapper {
	@RequestMapping(value = "/options/countByExample")
	long countByExample(OptionsExample example);
	@RequestMapping(value = "/options/deleteByExample")
	int deleteByExample(OptionsExample example);
	@RequestMapping(value = "/options/deleteByPrimaryKey")
	int deleteByPrimaryKey(@RequestParam("optionName")String optionName);
	@RequestMapping(value = "/options/insert")
	int insert(Options record);
	@RequestMapping(value = "/options/insertSelective")
	int insertSelective(Options record);
	@RequestMapping(value = "/options/selectByExample")
	List<Options> selectByExample(@RequestBody(required=false) OptionsExample example);
	@RequestMapping(value = "/options/selectByPrimaryKey")
	Options selectByPrimaryKey(@RequestParam("optionName") String optionName);
	@RequestMapping(value = "/options/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Options record,@RequestParam("orderByClause") OptionsExample example);
	@RequestMapping(value = "/options/updateByExample")
	int updateByExample(@RequestBody Options record,@RequestParam("orderByClause") OptionsExample example);
	@RequestMapping(value = "/options/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Options record);
	@RequestMapping(value = "/options/updateByPrimaryKey")
	int updateByPrimaryKey(Options record);
}