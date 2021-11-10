package com.hnguigu.hua.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Authon hua
 * @Date 2021/11/9 9:56
 * @Mail chuameng7@gmail.com
 * 制定统一返回的类型
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class R<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;
}
