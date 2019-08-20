package com.sy.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: dushiyu
 * @Date: 2019-08-20 15:38
 * @Version 1.0
 */
@Controller
@RequestMapping("/item")
public class ItemController {


    public String list(ModelMap modelMap){
        return "";
    }
}
