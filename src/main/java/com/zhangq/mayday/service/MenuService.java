package com.zhangq.mayday.service;

import com.zhangq.mayday.model.domain.Menu;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;

public interface MenuService {
	/**
	 * @return 所有菜单
	 */
	List<Menu> findMenus();

	/**
	 * 根据id查询
	 * 
	 * @param menuId
	 * @return
	 */
	Menu findByMenuId(Integer menuId);

	/**
	 * 添加
	 * 
	 * @param menu
	 */
	void save(Menu menu);

	/**
	 * 修改
	 * 
	 * @param menu
	 */
	void edit(Menu menu);

	/**
	 * 移除
	 * 
	 * @param menuId
	 */
	void remove(Integer menuId);

}
