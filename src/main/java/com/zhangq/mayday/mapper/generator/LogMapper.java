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
    long countByExample(@RequestBody(required = false) LogExample example);

    @RequestMapping(value = "/log/deleteByExample")
    int deleteByExample(@RequestBody(required = false) LogExample example);

    @RequestMapping(value = "/log/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "logId", required = false) Integer logId);

    @RequestMapping(value = "/log/insert")
    int insert(@RequestBody(required = false) Log record);

    @RequestMapping(value = "/log/insertSelective")
    int insertSelective(@RequestBody(required = false) Log record);

    @RequestMapping(value = "/log/selectByExample")
    List<Log> selectByExample(@RequestBody(required = false) LogExample example);

    @RequestMapping(value = "/log")
    Log selectByPrimaryKey(@RequestParam(value = "logId", required = false) Integer logId);

    @RequestMapping(value = "/log/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Log record, @RequestParam(value = "orderByClause", required = false) LogExample example);

    @RequestMapping(value = "/log/updateByExample")
    int updateByExample(@RequestBody(required = false) Log record, @RequestParam(value = "orderByClause", required = false) LogExample example);

    @RequestMapping(value = "/log/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Log record);

    @RequestMapping(value = "/log/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Log record);
}