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
	@RequestMapping(value ="/attachment/countByExample")
	long countByExample(AttachmentExample example);
	@RequestMapping(value ="/attachment/deleteByExample")
	int deleteByExample(AttachmentExample example);
	@RequestMapping(value ="/attachment/deleteByPrimaryKey")
	int deleteByPrimaryKey(@RequestParam("id") Integer id);
	@RequestMapping(value ="/attachment/insert")
	int insert(Attachment record);
	@RequestMapping(value ="/attachment/insertSelective")
	int insertSelective(Attachment record);
	@RequestMapping(value ="/attachment/selectByExample")
	List<Attachment> selectByExample(AttachmentExample example);
	@RequestMapping(value ="/attachment/selectByPrimaryKey")
	Attachment selectByPrimaryKey(Integer id);
	@RequestMapping(value ="/attachment/updateByExampleSelective")
	int updateByExampleSelective(@RequestBody Attachment record, @RequestParam("orderByClause") AttachmentExample example);
	@RequestMapping(value ="/attachment/updateByExample")
	int updateByExample(@RequestBody Attachment record,@RequestParam("orderByClause") AttachmentExample example);
	@RequestMapping(value ="/attachment/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Attachment record);
	@RequestMapping(value ="/attachment/updateByPrimaryKey")
	int updateByPrimaryKey(Attachment record);
}