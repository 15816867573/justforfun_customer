package com.zhangq.mayday.mapper.generator;

import com.zhangq.mayday.model.domain.User;
import com.zhangq.mayday.model.domain.UserExample;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "provider")
public interface UserMapper {
    @RequestMapping(value = "/user/countByExample")
    long countByExample(@RequestBody(required = false) UserExample example);

    @RequestMapping(value = "/user/deleteByExample")
    int deleteByExample(@RequestBody(required = false) UserExample example);

    @RequestMapping(value = "/user/deleteByPrimaryKey")
    int deleteByPrimaryKey(@RequestParam(value = "userId", required = false) Integer userId);

    @RequestMapping(value = "/user/insert")
    int insert(@RequestBody(required = false) User record);

    @RequestMapping(value = "/user/insertSelective")
    int insertSelective(@RequestBody(required = false) User record);

    @RequestMapping(value = "/user/selectByExample")
    List<User> selectByExample(@RequestBody(required = false) UserExample example);

    @RequestMapping(value = "/user/selectByPrimaryKey")
    User selectByPrimaryKey(@RequestParam(value = "userId", required = false) Integer userId);

    @RequestMapping(value = "/user/updateByExampleSelective")
    int updateByExampleSelective(@RequestBody(required = false) User record, @RequestParam(value = "orderByClause", required = false) UserExample example);

    @RequestMapping(value = "/user/updateByExample")
    int updateByExample(@RequestBody(required = false) User record, @RequestParam(value = "orderByClause", required = false) UserExample example);

    @RequestMapping(value = "/user/updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(@RequestBody(required = false) User record);

    @RequestMapping(value = "/user/updateByPrimaryKey")
    int updateByPrimaryKey(@RequestBody(required = false) User record);

    /**
     * 根据用户名和密码查询用户
     *
     * @param name 用户名
     * @param pwd  用户密码
     * @return 根据用户名和密码获取用户信息
     */
    @RequestMapping(value = "/user/getByNameAndPwd")
    User getByNameAndPwd(@RequestParam(value = "name") String name, @RequestParam(value = "pwd") String pwd);

    /**
     * 修改用户资料
     *
     * @param user
     */
    @RequestMapping("/user/updateDatum")
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
     * @param userId      用户id
     * @param formerlyPwd 原密码
     * @return
     */
    @RequestMapping(value = "/user/findByUserIdAndUserPwd")
    User findByUserIdAndUserPwd(@RequestParam(value = "userId") Integer userId,
                                @RequestParam(value = "formerlyPwd") String formerlyPwd);
}