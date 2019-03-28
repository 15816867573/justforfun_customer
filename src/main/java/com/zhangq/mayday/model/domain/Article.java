package com.zhangq.mayday.model.domain;

import java.util.Date;

/**
 * 文章/页面
 */
public class Article {
    /**
     * 文章编号
     */
    private Integer id;
    /**
     * 发表用户 多对一
     */
    private Integer userId;
    /**
     * 文章内容
     */
    private String articleContent;
    /**
     * 文章内容 Markdown格式
     */
    private String articleContentMd;

    private Date articleNewstime;
    /**
     * 0 已发布
     * 1 草稿
     * 2 回收站
     */
    private Integer articleStatus;
    /**
     * 文章摘要
     */
    private String articleSummary;
    /**
     * 缩略图
     */
    private String articleThumbnail;
    /**
     * 文章标题
     */
    private String articleTitle;
    /**
     * 文章类型0原创1转载
     */
    private Integer articleType;
    /**
     * 文章类型
     * post  文章
     * page  页面
     */
    private String articlePost;
    /**
     *是否开启评论 0开启1不开启
     * */
    private Integer articleComment;

    private Date articleUpdatetime;
    /**
     * 文章路径
     */
    private String articleUrl;

    /**
     * 文章访问量
     */
    private Long articleViews;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public String getArticleContentMd() {
        return articleContentMd;
    }

    public void setArticleContentMd(String articleContentMd) {
        this.articleContentMd = articleContentMd == null ? null : articleContentMd.trim();
    }

    public Date getArticleNewstime() {
        return articleNewstime;
    }

    public void setArticleNewstime(Date articleNewstime) {
        this.articleNewstime = articleNewstime;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public String getArticleSummary() {
        return articleSummary;
    }

    public void setArticleSummary(String articleSummary) {
        this.articleSummary = articleSummary == null ? null : articleSummary.trim();
    }

    public String getArticleThumbnail() {
        return articleThumbnail;
    }

    public void setArticleThumbnail(String articleThumbnail) {
        this.articleThumbnail = articleThumbnail == null ? null : articleThumbnail.trim();
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Integer getArticleType() {
        return articleType;
    }

    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }

    public String getArticlePost() {
        return articlePost;
    }

    public void setArticlePost(String articlePost) {
        this.articlePost = articlePost == null ? null : articlePost.trim();
    }

    public Integer getArticleComment() {
        return articleComment;
    }

    public void setArticleComment(Integer articleComment) {
        this.articleComment = articleComment;
    }

    public Date getArticleUpdatetime() {
        return articleUpdatetime;
    }

    public void setArticleUpdatetime(Date articleUpdatetime) {
        this.articleUpdatetime = articleUpdatetime;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl == null ? null : articleUrl.trim();
    }

    public Long getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(Long articleViews) {
        this.articleViews = articleViews;
    }
}