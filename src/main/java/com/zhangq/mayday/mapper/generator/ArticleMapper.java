package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.*;
import com.zhangq.mayday.model.dto.ArchiveBo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "provider")
public interface ArticleMapper {
    @RequestMapping(value = "/article/countByExample")
    long countByExample(@RequestBody(required = false) ArticleExample example);

    @RequestMapping(value = "/article/deleteByExample")
    int deleteByExample(@RequestBody(required = false) ArticleExample example);

    @RequestMapping(value = "/article/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "id", required = false) Integer id);

    @RequestMapping(value = "/article/insert")
    int insert(@RequestBody(required = false) Article record);

    @RequestMapping(value = "/article/insertSelective")
    int insertSelective(@RequestBody(required = false) Article record);

    @RequestMapping(value = "/article/selectByExample")
    List<Article> selectByExample(@RequestBody(required = false) ArticleExample example);

    @RequestMapping(value = "/article/selectByPrimaryKey")
    Article selectByPrimaryKey(@RequestParam(value = "id", required = false) Integer id);

    @RequestMapping(value = "/article/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Article record, @RequestParam(value = "orderByClause", required = false) ArticleExample example);

    @RequestMapping(value = "/article/updateByExample")
    int updateByExample(@RequestBody(required = false) Article record, @RequestParam(value = "orderByClause", required = false) ArticleExample example);

    @RequestMapping(value = "/article/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Article record);

    @RequestMapping(value = "/article/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Article record);

    /**
     * articleMapperCustom
     */
    @RequestMapping(value = "/article/articleMapperCustom")
    List<ArticleCustom> articleMapperCustom(@RequestParam(value = "articleStatus", required = false) Integer articleStatus);

    @RequestMapping(value = "/article/findAllArticle")
    List<ArticleCustom> findAllArticle(@RequestParam(value = "articleStatus", required = false) Integer articleStatus, @RequestParam(value = "articlePost", required = false) String articlePost);

    @RequestMapping(value = "/article/countByStatus")
    Integer countByStatus(@RequestParam(value = "articleStatus", required = false) Integer articleStatus, @RequestParam(value = "articlePost", required = false) String articlePost);

    @RequestMapping(value = "/article/updateStatus")
    void updateStatus(@RequestParam(value = "id", required = false) Integer id, @RequestParam(value = "articleStatus", required = false) Integer articleStatus);

    @RequestMapping(value = "/article/findByArticleId")
    ArticleCustom findByArticleId(@RequestParam(value = "article_id", required = false) Integer article_id);

    @RequestMapping(value = "/article/findDateAndCount")
    List<ArchiveBo> findDateAndCount();

    @RequestMapping(value = "/article/findPageArticle")
    List<ArticleCustom> findPageArticle(@RequestBody(required = false) ArticleCustom articleCustom);

    @RequestMapping(value = "/article/findRepeatByUrl")
    int findRepeatByUrl(@RequestParam(value = "articleUrl", required = false) String articleUrl);

    @RequestMapping(value = "/article/findByArticleUrl")
    ArticleCustom findByArticleUrl(@RequestParam(value = "articleUrl", required = false) String articleUrl);

    @RequestMapping(value = "/article/findArtileByCategory")
    List<ArticleCustom> findArtileByCategory(@RequestBody(required = false) Category category, @RequestParam(value = "articleStatus", required = false) Integer articleStatus);

    @RequestMapping(value = "/article/findArtileByTag")
    List<ArticleCustom> findArtileByTag(@RequestBody(required = false) Tag tag, @RequestParam(value = "articleStatus", required = false) Integer articleStatus);


}