package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.ArticleCategory;
import com.zhangq.mayday.model.domain.ArticleCategoryExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient(name = "provider")
public interface ArticleCategoryMapper {
	@RequestMapping(value = "/articleCategory/countByExample?name=feign")
	long countByExample(ArticleCategoryExample example);
	@RequestMapping(value = "/articleCategory/deleteByExample?name=feign")
	int deleteByExample(ArticleCategoryExample example);
	@RequestMapping(value = "/articleCategory/insert?name=feign")
	int insert(ArticleCategory record);
	@RequestMapping(value = "/articleCategory/insertSelective?name=feign")
	int insertSelective(ArticleCategory record);
	@RequestMapping(value = "/articleCategory/selectByExample?name=feign")
	List<ArticleCategory> selectByExample(@RequestBody ArticleCategoryExample example);
	@RequestMapping(value = "/articleCategory/updateByExampleSelective?name=feign")
	int updateByExampleSelective( @RequestParam("articleId") ArticleCategory record,
                                  @RequestBody ArticleCategoryExample example);
	@RequestMapping(value = "/articleCategory/updateByExample?name=feign")
	int updateByExample( @RequestParam("articleId") ArticleCategory record,
						 @RequestBody ArticleCategoryExample example);
}