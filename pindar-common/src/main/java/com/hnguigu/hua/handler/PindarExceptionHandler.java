package com.hnguigu.hua.handler;

import com.hnguigu.hua.exception.PindarControllerException;
import com.hnguigu.hua.exception.PindarException;
import com.hnguigu.hua.exception.PindarServiceException;
import com.hnguigu.hua.vo.R;
import com.hnguigu.hua.vo.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Authon hua
 * @Date 2021/11/9 10:04
 * @Mail chuameng7@gmail.com
 */
@ControllerAdvice
public class PindarExceptionHandler {

    /**
     * 监视解决 PindarServiceException 异常，目前只做异常消息打印
     * @param e
     * @return
     */
    @ExceptionHandler(value = PindarServiceException.class)
    public R pindarServiceHandler(PindarServiceException e){
        return R.builder().code(StatusCode.ERROR).message(e.getMessage()).data(null).build();
    }

    /**
     * 监视解决 PindarControllerException 异常，目前只做异常消息打印
     * @param e
     * @return
     */
    @ExceptionHandler(value = PindarControllerException.class)
    public R pindarControllerHandler(PindarControllerException e){
        return R.builder().code(StatusCode.ERROR).message(e.getMessage()).data(null).build();
    }

    /**
     * 监视解决 PindarException 异常，目前只做异常消息打印
     * @param e
     * @return
     */
    @ExceptionHandler(value = PindarException.class)
    public R pindarHandler(PindarException e){
        return R.builder().code(StatusCode.ERROR).message(e.getMessage()).data(null).build();
    }

    /**
     * 终极异常超出开发人员的设计的异常处理
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public R exceptionHandler(Exception e){
        return R.builder().code(StatusCode.ERROR).message("抱歉，您遇到了一个从来没有过的大问题，非常抱歉，给您带来不便，谢谢您，这将让我们更加完善的系统，祝您生活愉快！").build();
    }

}
