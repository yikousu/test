package com.hac.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hac
 * @date 2024/12/19
 */
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class ArticleController {

    @GetMapping("/articles")
    public String getAllArticles() {
        return "返回所有文章的假数据";
    }
}