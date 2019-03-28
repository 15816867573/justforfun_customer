package com.zhangq.mayday.web.controller.admin;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageInfo;
import com.zhangq.mayday.model.domain.Article;
import com.zhangq.mayday.model.domain.Comment;
import com.zhangq.mayday.model.dto.JsonResult;
import com.zhangq.mayday.model.enums.CommentStatus;
import com.zhangq.mayday.model.enums.MaydayEnums;
import com.zhangq.mayday.service.ArticleService;
import com.zhangq.mayday.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/comment/comment")
@Controller
public class CommentController extends BaseController  {
@Autowired
private CommentService commentService;
@Autowired
private ArticleService articleService;
    @GetMapping
    public String comment(Model model, @RequestParam(value = "page", defaultValue = "1") int page,
                          @RequestParam(value = "limit", defaultValue = "10") int limit,
                          @RequestParam(value = "status", defaultValue = "0") int status){
       Comment comment=new Comment();
        comment.setCommentStatus(status);
        PageInfo<Comment> pageInfo = commentService.findPageComment(page, limit,comment);
        model.addAttribute("info", pageInfo);
        // 已发布条数
        model.addAttribute("published",
                commentService.countByStatus(CommentStatus.PUBLISH.getStatus()));
        // 草稿条数
        model.addAttribute("draft",
                commentService.countByStatus(CommentStatus.DRAFT.getStatus()));
        // 回收站条数
        model.addAttribute("recycle",
                commentService.countByStatus(CommentStatus.RECYCLE.getStatus()));
        model.addAttribute("status", status);
        return "admin/comment/comment";
    }
    /**
     * 修改评论页面
     *
     * @param model
     * @return
     */
    @GetMapping(value = "/edit")
    public String editArticle(Model model, @RequestParam(value = "id") Integer id) {
        try {

            model.addAttribute("categorys", null);
            model.addAttribute("tags", null);
            model.addAttribute("articleCustom", null);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return "admin/admin_edit_article";
    }
    @GetMapping(value = "/new/save")
    @ResponseBody
    public JsonResult save(Comment comment, HttpServletRequest request){
        try {
            if (StrUtil.isEmpty(comment.getCommentAuthor())) {
                return new JsonResult(false, "用户昵称不能为空");
            }
            if (StrUtil.isEmpty(comment.getCommentContent())) {
                return new JsonResult(false, "评论内容不能为空");
            }
            if (StrUtil.isEmpty(String.valueOf(comment.getArticleId()))) {
                return new JsonResult(false, "文章ID不能为空");
            }
            Article article=articleService.findByArticleId(comment.getArticleId());
            comment.setCommentDate(DateUtil.date());
            commentService.save(comment);
            return new JsonResult(MaydayEnums.PRESERVE_SUCCESS.isFlag(), MaydayEnums.PRESERVE_SUCCESS.getMessage(),article);
        }catch (Exception e){
            e.printStackTrace();
            log.error("添加或更新失败" + e.getMessage());
            return new JsonResult(MaydayEnums.ERROR.isFlag(), MaydayEnums.ERROR.getMessage());
        }

    }
}
