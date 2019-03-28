package com.zhangq.mayday.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangq.mayday.mapper.custom.CommentMapperCustom;
import com.zhangq.mayday.model.domain.Comment;
import com.zhangq.mayday.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = RuntimeException.class)
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapperCustom commentMapperCustom;
    @Override
    public void save(Comment comment) throws Exception {
        commentMapperCustom.insert(comment);
    }

    @Override
    public List<Comment> findAllComment(int status, String post) {
        return null;
    }

    @Override
    public PageInfo<Comment> findPageComment(int page, int limit, Comment comment) {
        PageHelper.startPage(page, limit);
        List<Comment> lists = commentMapperCustom.findPageComment(comment);
        return new PageInfo<>(lists);
    }

    @Override
    public Integer countByStatus(Integer status) {
        return commentMapperCustom.countByStatus(status);
    }

    @Override
    public void remove(int id) throws Exception {

    }

    @Override
    public void recycle(int id, Integer integer) throws Exception {

    }

    @Override
    public Comment findByCommentId(Integer comment_id) {
        return null;
    }

    @Override
    public void update(Comment comment, Long[] tags, Long[] categorys) throws Exception {

    }

    @Override
    public List<Comment> archives() {
        return null;
    }

    @Override
    public int findRepeatByUrl(String articleUrl) {
        return 0;
    }

    @Override
    public Comment findByCommentUrl(String commenteUrl) {
        return null;
    }

    @Override
    public PageInfo<Comment> findCommentByKeywords(String keywords, Integer page, Integer limit) {
        return null;
    }

    @Override
    public void updateCommentViews(Comment article) {

    }

    @Override
    public PageInfo<Comment> findAllChildComment(Comment comment) {
        PageHelper.startPage(1, 10);
        List<Comment> lists = commentMapperCustom.findAllChildComment(comment);
        return new PageInfo<>(lists);
    }
}
