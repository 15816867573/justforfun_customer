package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Article;
import com.zhangq.mayday.model.domain.ArticleExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface ArticleMapper {
	@RequestMapping(value ="/article/countByExample")
	long countByExample(ArticleExample example);
	@RequestMapping(value ="/article/deleteByExample")
	int deleteByExample(ArticleExample example);
	@RequestMapping(value ="/article/deleteByPrimaryKey")
	int deleteByPrimaryKey(@RequestParam("id") Integer id);
	@RequestMapping(value ="/article/insert")
	int insert(Article record);
	@RequestMapping(value ="/article/insertSelective")
	int insertSelective(Article record);
	@RequestMapping(value ="/article/selectByExample")
	List<Article> selectByExample(ArticleExample example);
	@RequestMapping(value ="/article/selectByPrimaryKey")
	Article selectByPrimaryKey(@RequestParam("id")Integer id);
	@RequestMapping(value ="/article/updateByExampleSelective")
	int updateByExampleSelective( @RequestBody Article record,@RequestParam("orderByClause") ArticleExample example);
	@RequestMapping(value ="/article/updateByExample")
	int updateByExample(@RequestBody Article record,@RequestParam("orderByClause") ArticleExample example);
	@RequestMapping(value ="/article/updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Article record);
	@RequestMapping(value ="/article/updateByPrimaryKey")
	int updateByPrimaryKey(Article record);

}