package com.hac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hac
 * @date 2024/12/19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
        private Long id;
        private String name;
        private String position;
        private Double salary;
}
