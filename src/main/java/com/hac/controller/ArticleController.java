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


    @GetMapping("/articles/{id}")
    public String getArticleById(@PathVariable Long id) {
        return "返回 ID 为 " + id + " 的文章的假数据";
    }

    @PostMapping("/articles")
    public String createArticle(@RequestBody String content) {
        return "创建新文章，内容为: " + content;
    }
}