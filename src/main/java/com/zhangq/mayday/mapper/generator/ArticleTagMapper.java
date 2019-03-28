package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.ArticleTag;
import com.zhangq.mayday.model.domain.ArticleTagExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface ArticleTagMapper {
	@RequestMapping(value ="/articleTag/countByExample")
	long countByExample(ArticleTagExample example);
	@RequestMapping(value ="/articleTag/deleteByExample")
	int deleteByExample(ArticleTagExample example);
	@RequestMapping(value ="/articleTag/insert")
	int insert(ArticleTag record);
	@RequestMapping(value ="/articleTag/insertSelective")
	int insertSelective(ArticleTag record);
	@RequestMapping(value ="/articleTag/selectByExample")
	List<ArticleTag> selectByExample(ArticleTagExample example);
	@RequestMapping(value ="/articleTag/updateByExampleSelective")
	int updateByExampleSelective(@RequestParam("articleId") ArticleTag record,@RequestBody ArticleTagExample example);
	@RequestMapping(value ="/articleTag/updateByExample")
	int updateByExample( @RequestParam("articleId") ArticleTag record,@RequestBody ArticleTagExample example);
}