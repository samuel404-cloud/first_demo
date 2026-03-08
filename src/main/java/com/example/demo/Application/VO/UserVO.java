package com.example.demo.Application.VO;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class UserVO {
    /**
     * 名字
     */
    @NotNull(message = "名字不能为空")
    private String userName;

    /**
     * 年龄
     */
    private String userAge;

    @NotNull(message = "地址不能为空")
    private String userAddr;

    @Size(max = 4, message = "参数过长")
    private List<String> friendList;
}
