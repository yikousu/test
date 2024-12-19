package com.hac.controller;

import com.hac.pojo.ShoppingCart;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hac
 * @date 2024/12/19
 */

@RestController
@RequestMapping(value = "/api")
public class ShoppingCartController {
    @PostMapping(value = "/add")
    public void add(@RequestBody ShoppingCart shoppingCart) {
        // 入库  or  redis
        System.out.println("添加成功");
    }

}
