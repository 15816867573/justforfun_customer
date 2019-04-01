package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Attachment;
import com.zhangq.mayday.model.domain.AttachmentExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "provider")
public interface AttachmentMapper {
    @RequestMapping(value = "/attachment/countByExample")
    long countByExample(@RequestBody(required = false) AttachmentExample example);

    @RequestMapping(value = "/attachment/deleteByExample")
    int deleteByExample(@RequestBody(required = false) AttachmentExample example);

    @RequestMapping(value = "/attachment/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "id", required = false) Integer id);

    @RequestMapping(value = "/attachment/insert")
    int insert(@RequestBody(required = false) Attachment record);

    @RequestMapping(value = "/attachment/insertSelective")
    int insertSelective(@RequestBody(required = false) Attachment record);

    @RequestMapping(value = "/attachment/selectByExample")
    List<Attachment> selectByExample(@RequestBody(required = false) AttachmentExample example);

    @RequestMapping(value = "/attachment/selectByPrimaryKey")
    Attachment selectByPrimaryKey(@RequestParam(value = "id", required = false) Integer id);

    @RequestMapping(value = "/attachment/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Attachment record, @RequestParam(value = "orderByClause", required = false) AttachmentExample example);

    @RequestMapping(value = "/attachment/updateByExample")
    int updateByExample(@RequestBody(required = false) Attachment record, @RequestParam(value = "orderByClause", required = false) AttachmentExample example);

    @RequestMapping(value = "/attachment/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Attachment record);

    @RequestMapping(value = "/attachment/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Attachment record);
}