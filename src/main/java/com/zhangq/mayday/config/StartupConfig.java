package com.zhangq.mayday.config;

import com.zhangq.mayday.mapper.generator.OptionsMapper;
import com.zhangq.mayday.model.domain.Options;
import com.zhangq.mayday.model.dto.MaydayConst;
import com.zhangq.mayday.service.MenuService;
import com.zhangq.mayday.service.OptionsService;
import com.zhangq.mayday.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.List;

//@Configuration
public class StartupConfig implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private OptionsMapper optionsMapper;
    @Autowired
    private OptionsService optionsService;
    @Autowired
    private MenuService menuService;
    @Autowired
    private ThemeService themeService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
        this.loadOptions();
      //  this.loadMenus();
       // this.loadThemeName();
    }

    /**
     * 加载设置选项
     */
    private void loadOptions() {
        List<Options> listMap = optionsService.selectMap();
        if (listMap.size() > 0 && !listMap.isEmpty()) {
            for (Options options : listMap) {
                MaydayConst.OPTIONS.put(options.getOptionName(), options.getOptionValue());
            }
        }
    }

    /**
     * 加载菜单
     */
    private void loadMenus() {
        MaydayConst.MENUS = menuService.findMenus();
    }

    /**
     * 加载主题
     */
    private void loadThemeName() {
        MaydayConst.THEME_NAME = themeService.getEnabledTheme();
    }

}
