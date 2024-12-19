package com.hac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author hac
 * @date 2024/12/19
 */
@Data
@AllArgsConstructor
public class Article {
    private Integer id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime publishTime;
}
