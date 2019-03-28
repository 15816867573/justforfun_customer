package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Link;
import com.zhangq.mayday.model.domain.LinkExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface LinkMapper {
	@RequestMapping(value = "/link/countByExample")
	long countByExample(LinkExample example);
	@RequestMapping(value = "/link/deleteByExample")
	int deleteByExample(LinkExample example);
	@RequestMapping(value = "/link/deleteByPrimaryKey")
	int deleteByPrimaryKey(@RequestParam("linkId") Integer linkId);
	@RequestMapping(value = "/link/insert")
	int insert(Link record);
	@RequestMapping(value = "/link/insertSelective")
	int insertSelective(Link record);
	@RequestMapping(value = "/link/selectByExample")
	List<Link> selectByExample(LinkExample example);
	@RequestMapping(value = "/link/selectByPrimaryKey")
	Link selectByPrimaryKey(@RequestParam("linkId") Integer linkId);
	@RequestMapping(value = "/link/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Link record,@RequestParam("orderByClause") LinkExample example);
	@RequestMapping(value = "/link/updateByExample")
	int updateByExample(@RequestBody Link record,@RequestParam("orderByClause") LinkExample example);
	@RequestMapping(value = "/link/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Link record);
	@RequestMapping(value = "/link/updateByPrimaryKey")
	int updateByPrimaryKey(Link record);
}