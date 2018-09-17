package com.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 作者 ：lichao
 * 部门 : 开发二部
 * 时间 ：2018/9/11
 * 公司 ：国金黄金
 */
@RestController
@RequestMapping("/api")
@Api(tags="登录接口")
public class LoginController {


    @GetMapping("login")
    @ApiOperation("登录")
    public String login() {
        return "水水水水";
    }
}
