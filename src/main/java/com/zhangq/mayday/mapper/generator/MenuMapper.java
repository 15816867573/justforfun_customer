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
    long countByExample(@RequestBody(required = false) MenuExample example);

    @RequestMapping(value = "/menu/countByExample")
    int deleteByExample(@RequestBody(required = false) MenuExample example);

    @RequestMapping(value = "/menu/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "menuId", required = false) Integer menuId);

    @RequestMapping(value = "/menu/insert")
    int insert(@RequestBody(required = false) Menu record);

    @RequestMapping(value = "/menu/insertSelective")
    int insertSelective(@RequestBody(required = false) Menu record);

    @RequestMapping(value = "/menu/selectByExample")
    List<Menu> selectByExample(@RequestBody(required = false) MenuExample example);

    @RequestMapping(value = "/menu/selectByPrimaryKey")
    Menu selectByPrimaryKey(@RequestParam(value = "menuId", required = false) Integer menuId);

    @RequestMapping(value = "/menu/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Menu record, @RequestParam(value = "orderByClause", required = false) MenuExample example);

    @RequestMapping(value = "/menu/updateByExample")
    int updateByExample(@RequestBody(required = false) Menu record, @RequestParam(value = "orderByClause", required = false) MenuExample example);

    @RequestMapping(value = "/menu/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Menu record);

    @RequestMapping(value = "/menu/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Menu record);
}