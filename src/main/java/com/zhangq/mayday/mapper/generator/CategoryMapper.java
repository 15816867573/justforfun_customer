package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Category;
import com.zhangq.mayday.model.domain.CategoryExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface CategoryMapper {
	@RequestMapping(value = "/category/countByExample")
	long countByExample(CategoryExample example);
	@RequestMapping(value = "/category/deleteByExample")
	int deleteByExample(CategoryExample example);
	@RequestMapping(value = "/category/deleteByPrimaryKey")
	int deleteByPrimaryKey(Integer categoryId);
	@RequestMapping(value = "/category/insert")
	int insert(Category record);
	@RequestMapping(value = "/category/insertSelective")
	int insertSelective(Category record);
	@RequestMapping(value = "/category/selectByExample")
	List<Category> selectByExample(CategoryExample example);
	@RequestMapping(value = "/category/selectByPrimaryKey")
	Category selectByPrimaryKey(Integer categoryId);
	@RequestMapping(value = "/category/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Category record, @RequestParam("orderByClause") CategoryExample example);
	@RequestMapping(value = "/category/updateByExample")
	int updateByExample(@RequestBody Category record, @RequestParam("orderByClause") CategoryExample example);
	@RequestMapping(value = "/category/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Category record);
	@RequestMapping(value = "/category/updateByPrimaryKey")
	int updateByPrimaryKey(Category record);
}