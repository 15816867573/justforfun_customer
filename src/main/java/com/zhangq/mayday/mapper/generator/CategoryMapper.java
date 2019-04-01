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
    long countByExample(@RequestBody(required = false) CategoryExample example);

    @RequestMapping(value = "/category/deleteByExample")
    int deleteByExample(@RequestBody(required = false) CategoryExample example);

    @RequestMapping(value = "/category/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "categoryId", required = false) Integer categoryId);

    @RequestMapping(value = "/category/insert")
    int insert(@RequestBody(required = false) Category record);

    @RequestMapping(value = "/category/insertSelective")
    int insertSelective(@RequestBody(required = false) Category record);

    @RequestMapping(value = "/category/selectByExample")
    List<Category> selectByExample(@RequestBody(required = false) CategoryExample example);

    @RequestMapping(value = "/category/selectByPrimaryKey")
    Category selectByPrimaryKey(@RequestParam(value = "categoryId", required = false) Integer categoryId);

    @RequestMapping(value = "/category/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Category record, @RequestParam(value = "orderByClause", required = false) CategoryExample example);

    @RequestMapping(value = "/category/updateByExample")
    int updateByExample(@RequestBody(required = false) Category record, @RequestParam(value = "orderByClause", required = false) CategoryExample example);

    @RequestMapping(value = "/category/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Category record);

    @RequestMapping(value = "/category/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Category record);
}