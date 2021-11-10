package com.hnguigu.hua.vo;

import java.io.Serializable;

/**
 * @author hua
 * @version 1.0.0
 * @DATE 2021/10/28 16:16
 * 100-199 用于指定客户端应相应的某些动作。
 * 200-299 用于表示请求成功。
 * 300-399 用于已经移动的文件并且常被包含在定位头信息中指定新的地址信息。
 * 400-499 用于指出客户端的错误。
 * 500-599 用于支持服务器错误。
 */
public class StatusCode implements Serializable {

    /**
     * 错误
     */
    public static Integer ERROR = 520;

    /**
     * 成功
     */
    public static Integer SUCCESS = 250;

    /**
     * 失败
     */
    public static Integer FAILURE = 380;
}
