package com.hac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author hac
 * @date 2024/12/19
 */
@Data
@AllArgsConstructor
public class Order implements Serializable {
    private Long orderId;
    private Long userId;
    private Long productId;
    private Integer quantity;
    private Double totalPrice;
}
