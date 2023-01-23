package com.anyteam.dogcat

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@RequestMapping("/")
class Index
{
    @RequestMapping("/")
    fun index(): String
    {
        return "index"
    }

    @ResponseBody
    @RequestMapping("/j")
    fun j() : String
    {
        return "hahaha"
    }
}