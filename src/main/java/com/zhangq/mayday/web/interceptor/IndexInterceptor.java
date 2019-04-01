package com.zhangq.mayday.web.interceptor;

import com.zhangq.mayday.mapper.generator.OptionsMapper;
import com.zhangq.mayday.model.domain.Options;
import com.zhangq.mayday.model.dto.MaydayConst;
import com.zhangq.mayday.service.MenuService;
import com.zhangq.mayday.service.OptionsService;
import com.zhangq.mayday.service.ThemeService;
import com.zhangq.mayday.util.Commons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Component
public class IndexInterceptor implements HandlerInterceptor {
	@Autowired
	private Commons commons;
	@Autowired
	private OptionsMapper optionsMapper;
	@Autowired
	private OptionsService optionsService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private ThemeService themeService;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
		String requestType = request.getHeader("X-Requested-With");
		//非ajax请求
		if(!"XMLHttpRequest".equals(requestType)){
			loadOptions();
			loadMenus();
			loadThemeName();
			// 工具类
			request.setAttribute("commons", commons);
			// 设置项
			request.setAttribute("options", MaydayConst.OPTIONS);
			// 菜单
			request.setAttribute("menus", MaydayConst.MENUS);
		}
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
	/**
	 * StartupConfig.class
	 * */

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
