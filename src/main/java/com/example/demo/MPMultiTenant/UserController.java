package com.example.demo.MPMultiTenant;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.MPMultiTenant.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 *
 * @date:2023/9/19 9:26
 * @author: ilpvc
 */
@RestController
public class UserController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/user")
    public List<User> getUserList() {
        return userMapper.selectList(new LambdaQueryWrapper<User>().isNotNull(User::getId));
    }
}
