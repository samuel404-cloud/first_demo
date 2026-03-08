package com.example.demo.Application.service.api.impl;

import com.example.demo.Application.VO.UserVO;
import com.example.demo.Interface.service.api.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public UserVO getUser() {
        UserVO userVO = new UserVO();
        userVO.setUserName("admin");
        log.info("user info: {}", userVO);
        return userVO;
    }
}
