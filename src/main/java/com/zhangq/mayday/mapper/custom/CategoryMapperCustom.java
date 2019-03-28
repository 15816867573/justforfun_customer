package com.zhangq.mayday.mapper.custom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "provider")
public interface CategoryMapperCustom {
    @RequestMapping(value = "/category/selectByarticleId")
    List<Integer> selectByarticleId(@RequestParam("id") Integer id);
    @RequestMapping(value = "/category/delete")
    @ResponseBody
    void delete(@RequestBody List<Integer> cateList, @RequestParam(value = "articleId") Integer articleId);

}