package com.hnguigu.hua.exception;

/**
 * @Authon hua
 * @Date 2021/11/9 9:58
 * @Mail chuameng7@gmail.com
 * 自定义异常 service 层，专用于 服务操作层 service 实现层异常处理
 */
public class PindarServiceException extends PindarException{

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public PindarServiceException(String message) {
        super(message);
    }
}
