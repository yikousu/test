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
public class ShoppingCart {

    // 随便写的 测试
    private Long id;
    private Long userId;
    private Long productId;
    private Integer quantity;
    private Double totalPrice;
    private String productName;
    private Double price;

}
