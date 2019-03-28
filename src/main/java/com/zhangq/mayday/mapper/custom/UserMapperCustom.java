package com.zhangq.mayday.mapper.custom;

import com.zhangq.mayday.model.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@FeignClient(name = "provider")
public interface UserMapperCustom {
	/**
	 * 根据用户名和密码查询用户
	 * 
	 * @param name
	 *            用户名
	 * @param pwd
	 *            用户密码
	 * @return 根据用户名和密码获取用户信息
	 */
	@RequestMapping(value = "/user/getByNameAndPwd/{name}/{pwd}")
	User getByNameAndPwd(@RequestParam("name") String name, @RequestParam("pwd") String pwd);

	/**
	 * 修改用户资料
	 * 
	 * @param user
	 */
	@RequestMapping(value = "/user/updateDatum")
	@ResponseBody
	void updateDatum(@RequestBody User user);

	/**
	 * 用户资料查询
	 * 
	 * @return
	 */
	@RequestMapping(value = "/user/findUser")
	List<User> findUser();

	/**
	 * 查询原密码是否存在
	 * 
	 * @param userId
	 *            用户id
	 * @param formerlyPwd
	 *            原密码
	 * @return
	 */
	@RequestMapping(value = "/user/findByUserIdAndUserPwd")
	User findByUserIdAndUserPwd(@RequestParam(value = "userId") Integer userId,
                                @RequestParam(value = "formerlyPwd") String formerlyPwd);

}