package com.hac.controller;

import com.hac.pojo.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeController {

    // 1. 获取所有员工的接口
    @GetMapping
    public List<Employee> getAllEmployees() {
        // 返回假数据
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "张三", "软件工程师", 12000.0));
        employees.add(new Employee(2L, "李四", "产品经理", 15000.0));
        employees.add(new Employee(3L, "王五", "测试工程师", 10000.0));
        return employees;
    }

    // 2. 根据 ID 获取单个员工的接口
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        // 返回假数据
        return new Employee(id, "张三", "软件工程师", 12000.0);
    }

    // 3. 创建新员工的接口
    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {
        // 返回假数据
        return "创建新员工成功: " + employee.toString();
    }
}