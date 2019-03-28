package com.zhangq.mayday.service;

import com.github.pagehelper.PageInfo;
import com.zhangq.mayday.model.domain.Comment;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
public interface CommentService  {
    /**
     * 保存评论
     *
     * @param article
     *            文章
     * @param tagsName
     *            标签id
     * @param categorys
     *            分类id
     */
    void save(Comment comment) throws Exception;

    /**
     * 不分页查询所有文章
     *
     * @param status
     * @param string
     * @return
     */
    List<Comment> findAllComment(int status, String post);

    /**
     * 分页查询所有评论
     *
     * @param limit
     * @param page
     * @param articleCustom
     *            文章对象
     * @return
     */
    PageInfo<Comment> findPageComment(int page, int limit, Comment comment);

    /**
     * 状态统计条数
     *
     * @param status
     *            状态
     * @param post
     *            类型
     * @return
     */
    Integer countByStatus(Integer status);

    /**
     * 修改文章状态为回收站
     *
     * @param id
     */
    void remove(int id) throws Exception;

    /**
     * 修改文章状态为回收站
     *
     * @param id
     * @param integer
     */
    void recycle(int id, Integer integer) throws Exception;

    /**
     * id查询文章
     *
     * @param article_id
     * @return
     */
    Comment findByCommentId(Integer comment_id);

    /**
     * 修改文章
     *
     * @param article
     * @param tags
     *            标签id
     * @param categorys
     *            分类id
     * @throws Exception
     */
    void update(Comment comment, Long[] tags, Long[] categorys) throws Exception;

    /**
     * 归档
     *
     * @return
     */
    List<Comment> archives();

    /**
     * 统计重复链接
     *
     * @param articleUrl
     *            文章链接
     * @return
     */
    int findRepeatByUrl(String articleUrl);

    /**
     * 文章链接查询
     *
     * @param articleUrl
     * @return 文章
     */
    Comment findByCommentUrl(String commenteUrl);

    /**
     * 分页查询分类下的所有文章
     *
     * @param page
     * @param limit
     * @param category
     * @param status 文章状态
     * @return
     */
   // PageInfo<Comment> findcommentByCategory(int page, int limit, Category category, int status);

    /**
     * 分页查询标签下的所有文章
     *
     * @param page
     * @param size
     * @param tag
     * @param status 文章状态
     * @return
     */
   // PageInfo<ArticleCustom> findArtileByTag(Integer page, Integer limit, Tag tag, int status);

    /**
     * 标题分页搜索文章
     *
     * @param keywords
     * @param page
     * @param size
     * @return
     */
    PageInfo<Comment> findCommentByKeywords(String keywords, Integer page, Integer limit);
    /**
     * 修改文章点击数
     * @param article
     */
    void updateCommentViews(Comment article);
    /**
     * 根据评论查询此评论的所有子评论
     * */
    PageInfo<Comment> findAllChildComment(Comment comment);
}
