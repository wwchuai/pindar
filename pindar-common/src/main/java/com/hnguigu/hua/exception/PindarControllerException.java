package com.hnguigu.hua.exception;

/**
 * @Authon hua
 * @Date 2021/11/9 10:01
 * @Mail chumeng7@gmail.com
 * 自定义异常 controller 层，专用于 外部操作层 controller 接口操作层异常处理
 */
public class PindarControllerException extends PindarException{

    /**
     * Constructs a new runtime exception with the specified detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public PindarControllerException(String message) {
        super(message);
    }
}
