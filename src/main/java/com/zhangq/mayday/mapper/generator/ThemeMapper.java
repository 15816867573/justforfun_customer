package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.Theme;
import com.zhangq.mayday.model.domain.ThemeExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(name = "provider")
public interface ThemeMapper {
    @RequestMapping(value = "/theme/countByExample")
    long countByExample(@RequestBody(required = false) ThemeExample example);

    @RequestMapping(value = "/theme/deleteByExample")
    int deleteByExample(@RequestBody(required = false) ThemeExample example);

    @RequestMapping(value = "/theme/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "id", required = false) Integer id);

    @RequestMapping(value = "/theme/insert")
    int insert(@RequestBody(required = false) Theme record);

    @RequestMapping(value = "/theme/insertSelective")
    int insertSelective(@RequestBody(required = false) Theme record);

    @RequestMapping(value = "/theme/selectByExample")
    List<Theme> selectByExample(@RequestBody ThemeExample example);
    @RequestMapping(value = "/theme/selectByPrimaryKey")
    Theme selectByPrimaryKey(@RequestParam(value = "id", required = false) Integer id);

    @RequestMapping(value = "/theme/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) Theme record, @RequestParam(value = "orderByClause", required = false) ThemeExample example);

    @RequestMapping(value = "/theme/updateByExample")
    int updateByExample(@RequestBody(required = false) Theme record, @RequestParam(value = "orderByClause", required = false) ThemeExample example);

    @RequestMapping(value = "/theme/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) Theme record);

    @RequestMapping(value = "/theme/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) Theme record);

    @RequestMapping(value = "/theme/updateStatus")
    void updateStatus(@RequestParam(value = "status") int status, @RequestParam(value = "id") int id);
}