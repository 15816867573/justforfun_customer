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
    long countByExample(@RequestBody(required = false) LinkExample example);

    @RequestMapping(value = "/link/deleteByExample")
    int deleteByExample(@RequestBody(required = false) LinkExample example);

    @RequestMapping(value = "/link/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "linkId", required = false) Integer linkId);

    @RequestMapping(value = "/link/insert")
    int insert(@RequestBody(required = false) Link record);

    @RequestMapping(value = "/link/insertSelective")
    int insertSelective(@RequestBody(required = false) Link record);

    @RequestMapping(value = "/link/selectByExample")
    List<Link> selectByExample(@RequestBody(required = false) LinkExample example);

    @RequestMapping(value = "/link/selectByPrimaryKey")
    Link selectByPrimaryKey(@RequestParam(value = "linkId", required = false) Integer linkId);

    @RequestMapping(value = "/link/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Link record, @RequestParam(value = "orderByClause", required = false) LinkExample example);

    @RequestMapping(value = "/link/updateByExample")
    int updateByExample(@RequestBody(required = false) Link record, @RequestParam(value = "orderByClause", required = false) LinkExample example);

    @RequestMapping(value = "/link/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Link record);

    @RequestMapping(value = "/link/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Link record);
}