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
    long countByExample(@RequestBody(required = false) OptionsExample example);

    @RequestMapping(value = "/options/deleteByExample")
    int deleteByExample(@RequestBody(required = false) OptionsExample example);

    @RequestMapping(value = "/options/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "optionName", required = false) String optionName);

    @RequestMapping(value = "/options/insert")
    int insert(@RequestBody(required = false) Options record);

    @RequestMapping(value = "/options/insertSelective")
    int insertSelective(@RequestBody(required = false) Options record);

    @RequestMapping(value = "/options/selectByExample")
    List<Options> selectByExample(@RequestBody(required = false) OptionsExample example);

    @RequestMapping(value = "/options/selectByPrimaryKey")
    Options selectByPrimaryKey(@RequestParam(value = "optionName", required = false) String optionName);

    @RequestMapping(value = "/options/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Options record, @RequestParam(value = "orderByClause", required = false) OptionsExample example);

    @RequestMapping(value = "/options/updateByExample")
    int updateByExample(@RequestBody(required = false) Options record, @RequestParam(value = "orderByClause", required = false) OptionsExample example);

    @RequestMapping(value = "/options/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Options record);

    @RequestMapping(value = "/options/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Options record);
}