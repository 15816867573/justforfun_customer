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
    @RequestMapping(value = "/articleTag/countByExample")
    long countByExample(@RequestBody(required = false) ArticleTagExample example);

    @RequestMapping(value = "/articleTag/deleteByExample")
    int deleteByExample(@RequestBody(required = false) ArticleTagExample example);

    @RequestMapping(value = "/articleTag/insert")
    int insert(@RequestBody(required = false) ArticleTag record);

    @RequestMapping(value = "/articleTag/insertSelective")
    int insertSelective(@RequestBody(required = false) ArticleTag record);

    @RequestMapping(value = "/articleTag/selectByExample")
    List<ArticleTag> selectByExample(@RequestBody(required = false) ArticleTagExample example);

    @RequestMapping(value = "/articleTag/updateByExampleSelective")
    int updateByExampleSelective(@RequestParam(value = "articleId", required = false) ArticleTag record, @RequestBody(required = false) ArticleTagExample example);

    @RequestMapping(value = "/articleTag/updateByExample")
    int updateByExample(@RequestParam(value = "articleId", required = false) ArticleTag record, @RequestBody(required = false) ArticleTagExample example);
}