package com.zhangq.mayday.mapper.custom;

import com.zhangq.mayday.model.domain.Comment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@FeignClient(name = "provider")
public interface CommentMapperCustom {
    @RequestMapping("/comment/findPageComment")
    List<Comment> findPageComment(Comment comment);
    @RequestMapping("/comment/countByStatus")
    Integer countByStatus(@RequestParam(value = "status") Integer status);
    @RequestMapping("/comment/insert")
    @ResponseBody
    void insert(@RequestBody Comment comment);
    @RequestMapping("/comment/findAllChildComment")
    @ResponseBody
    List<Comment> findAllChildComment(@RequestBody Comment comment);
}
