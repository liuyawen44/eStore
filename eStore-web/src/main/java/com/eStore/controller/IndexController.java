/*
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.eStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liuyawen02 on 17/5/31.
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/index","/"})
    public String index() {
        return "index";
    }
}
