package com.zhangq.mayday.web.controller.front;

import com.zhangq.mayday.model.domain.Category;
import com.zhangq.mayday.model.domain.Menu;
import com.zhangq.mayday.model.domain.MenuDTO;
import com.zhangq.mayday.model.dto.ArchiveBo;
import com.zhangq.mayday.model.dto.JsonResult;
import com.zhangq.mayday.model.enums.MaydayEnums;
import com.zhangq.mayday.service.ArticleService;
import com.zhangq.mayday.service.CategoryService;
import com.zhangq.mayday.service.MenuService;
import com.zhangq.mayday.web.controller.admin.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping(value = "/navbor")
@Controller
public class NavborController extends BaseController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private MenuService menuService;
    @GetMapping(value = "/navbor")
    @ResponseBody
    public JsonResult navbor(Model model){
        try {
            //归档信息
            Map map=new HashMap<>();
            List<Menu> menusList= menuService.findMenus();
            List<ArchiveBo> archiveBoList = articleService.archives();
            List<MenuDTO> list=new ArrayList();
            for (int i = 0; i < archiveBoList.size(); i++) {
                    MenuDTO dto=new MenuDTO();
                    dto.setName(archiveBoList.get(i).getDate());
                    dto.setUrl("");
                    list.add(dto);
            }
            menusList.get(1).setMenuList(list);
        //     map.put("archiveBoList",archiveBoList);
            //分类
             List<Category> categoryList= categoryService.findCategory();
             List<MenuDTO> list2=new ArrayList<>();
            for (int i = 0; i < categoryList.size(); i++) {
              MenuDTO dto=new MenuDTO();
              dto.setName(categoryList.get(i).getCategoryName());
              dto.setUrl(categoryList.get(i).getCategoryUrl());
              list2.add(dto);
            }
            menusList.get(2).setMenuList(list2);
         //    map.put("categoryList",categoryList);
            //文章
            //设置
            //用户
            map.put("menusList",menusList);
            return new JsonResult(MaydayEnums.PRESERVE_SUCCESS.isFlag(), MaydayEnums.PRESERVE_SUCCESS.getMessage(),map);
        }catch (Exception e){
            e.printStackTrace();
            log.error("添加或更新失败" + e.getMessage());
            return new JsonResult(MaydayEnums.ERROR.isFlag(), MaydayEnums.ERROR.getMessage());
        }
//return "admin/module/navbor";

    }
}
