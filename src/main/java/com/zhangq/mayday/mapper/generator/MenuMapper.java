package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Menu;
import com.zhangq.mayday.model.domain.MenuExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface MenuMapper {
	@RequestMapping(value = "/menu/countByExample")
	long countByExample(MenuExample example);
	@RequestMapping(value = "/menu/countByExample")
	int deleteByExample(MenuExample example);
	@RequestMapping(value = "/menu/deleteByPrimaryKey")
	int deleteByPrimaryKey(@RequestParam("menuId") Integer menuId);
	@RequestMapping(value = "/menu/insert")
	int insert(Menu record);
	@RequestMapping(value = "/menu/insertSelective")
	int insertSelective(Menu record);
	@RequestMapping(value = "/menu/selectByExample")
	List<Menu> selectByExample(MenuExample example);
	@RequestMapping(value = "/menu/selectByPrimaryKey")
	Menu selectByPrimaryKey(Integer menuId);
	@RequestMapping(value = "/menu/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Menu record,@RequestParam("orderByClause") MenuExample example);
	@RequestMapping(value = "/menu/updateByExample")
	int updateByExample( @RequestBody Menu record, @RequestParam("orderByClause") MenuExample example);
	@RequestMapping(value = "/menu/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Menu record);
	@RequestMapping(value = "/menu/updateByPrimaryKey")
	int updateByPrimaryKey(Menu record);
}