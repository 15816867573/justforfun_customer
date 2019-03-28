package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Tag;
import com.zhangq.mayday.model.domain.TagExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface TagMapper {
	@RequestMapping(value = "/tagExample/countByExample")
	long countByExample(TagExample example);
	@RequestMapping(value = "/tagExample/deleteByExample")
	int deleteByExample(TagExample example);
	@RequestMapping(value = "/tagExample/deleteByPrimaryKey")
	int deleteByPrimaryKey(@RequestParam("tagId") Integer tagId);
	@RequestMapping(value = "/tagExample/insert")
	int insert(Tag record);
	@RequestMapping(value = "/tagExample/insertSelective")
	int insertSelective(Tag record);
	@RequestMapping(value = "/tagExample/selectByExample")
	List<Tag> selectByExample(TagExample example);
	@RequestMapping(value = "/tagExample/selectByPrimaryKey")
	Tag selectByPrimaryKey(@RequestParam("tagId") Integer tagId);
	@RequestMapping(value = "/tagExample/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Tag record, @RequestParam("orderByClause")TagExample example);
	@RequestMapping(value = "/tagExample/updateByExample")
	int updateByExample( @RequestBody Tag record, @RequestParam("orderByClause")TagExample example);
	@RequestMapping(value = "/tagExample/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Tag record);
	@RequestMapping(value = "/tagExample/updateByPrimaryKey")
	int updateByPrimaryKey(Tag record);
}