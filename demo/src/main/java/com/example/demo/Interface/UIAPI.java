package com.example.demo.Interface;

import com.example.demo.Application.VO.UserVO;
import com.example.demo.Application.service.api.impl.UserService;
import com.example.demo.Interface.anotation.ValidateParamListLength;
import com.example.demo.Interface.service.api.IUserService;
import com.example.demo.common.LogHandlerInvocationHandler;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Proxy;
import java.util.List;


@RestController
@RequestMapping("/api")
//@Slf4j
public class UIAPI {
    private static final Logger log = LoggerFactory.getLogger(UIAPI.class);

    @PostMapping("sayHello")
//    @ValidateParamListLength
    public String sayHello(@Valid @RequestBody UserVO userVO) {
        log.info("input user： {}", userVO);
        IUserService oriUserService = new UserService();
        IUserService userService = (IUserService)Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{IUserService.class}, new LogHandlerInvocationHandler(oriUserService));
        userVO = userService.getUser();
        log.info("output user： {}", userVO);
        return "Hello" + userVO.getUserName();
    }

    @PostMapping("sayGoodBye")
    public String sayGoodBye(@Valid @RequestBody List<UserVO> userVO) {
        return "Good Bye! " + userVO.get(0).getUserName();
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Object processException(MethodArgumentNotValidException e){
        log.error(e.getMessage());
        return e.getAllErrors().get(0).getDefaultMessage();
    }
}
