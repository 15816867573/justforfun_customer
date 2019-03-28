package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Theme;
import com.zhangq.mayday.model.domain.ThemeExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface ThemeMapper {
	@RequestMapping(value = "/theme/countByExample")
	long countByExample(ThemeExample example);
	@RequestMapping(value = "/theme/deleteByExample")
	int deleteByExample(ThemeExample example);
	@RequestMapping(value = "/theme/deleteByPrimaryKey")
	int deleteByPrimaryKey(Integer id);
	@RequestMapping(value = "/theme/insert")
	int insert(Theme record);
	@RequestMapping(value = "/theme/insertSelective")
	int insertSelective(Theme record);
	@RequestMapping(value = "/theme/selectByExample")
	List<Theme> selectByExample(ThemeExample example);
	@RequestMapping(value = "/theme/selectByPrimaryKey")
	Theme selectByPrimaryKey(Integer id);
	@RequestMapping(value = "/theme/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Theme record, @RequestParam("orderByClause")ThemeExample example);
	@RequestMapping(value = "/theme/updateByExample")
	int updateByExample( @RequestBody Theme record,  @RequestParam("orderByClause")ThemeExample example);
	@RequestMapping(value = "/theme/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Theme record);
	@RequestMapping(value = "/theme/updateByPrimaryKey")
	int updateByPrimaryKey(Theme record);
}