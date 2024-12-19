package com.hac.controller;

import com.hac.pojo.Order;
import com.hac.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hac
 * @date 2024/12/19
 */
@RestController
@RequestMapping(value = "/api")
public class OrderController {
    @GetMapping(value = "/list")
    public List<Order> user() {
        List<Order> list = new ArrayList<>();
        // 模拟数据库拿数据
        list.add(new Order("1", "1", "1", 1, 1.0));
        return list;
    }
}
