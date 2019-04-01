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
    long countByExample(@RequestBody(required = false) TagExample example);

    @RequestMapping(value = "/tagExample/deleteByExample")
    int deleteByExample(@RequestBody(required = false) TagExample example);

    @RequestMapping(value = "/tagExample/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "tagId", required = false) Integer tagId);

    @RequestMapping(value = "/tagExample/insert")
    int insert(@RequestBody(required = false) Tag record);

    @RequestMapping(value = "/tagExample/insertSelective")
    int insertSelective(@RequestBody(required = false) Tag record);

    @RequestMapping(value = "/tagExample/selectByExample")
    List<Tag> selectByExample(@RequestBody(required = false) TagExample example);

    @RequestMapping(value = "/tagExample/selectByPrimaryKey")
    Tag selectByPrimaryKey(@RequestParam(value = "tagId", required = false) Integer tagId);

    @RequestMapping(value = "/tagExample/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Tag record, @RequestParam(value = "orderByClause", required = false) TagExample example);

    @RequestMapping(value = "/tagExample/updateByExample")
    int updateByExample(@RequestBody(required = false) Tag record, @RequestParam(value = "orderByClause", required = false) TagExample example);

    @RequestMapping(value = "/tagExample/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Tag record);

    @RequestMapping(value = "/tagExample/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Tag record);
}