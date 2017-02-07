package com.vivo.demo.spring.boot.demo.exception.handler;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vivo.demo.spring.boot.demo.constant.HttpConstant.ReturnCode;
import com.vivo.demo.spring.boot.demo.constant.HttpConstant.ReturnMessage;
import com.vivo.demo.spring.boot.demo.exception.ServiceException;
import com.vivo.demo.spring.boot.demo.util.MessageHandleUtil;

@ControllerAdvice
public class DefaultExceptionHandler {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultExceptionHandler.class);
    
    @ExceptionHandler({ Exception.class })
    @ResponseBody
    public String processServiceException(Exception e) {
        if (null != e && StringUtils.isNotBlank(e.getMessage())) {
            if (e instanceof ServiceException) {/* 业务异常,不打印日志 */
                LOGGER.debug(e.getMessage(), e);
                ServiceException ex = (ServiceException) e;
                return MessageHandleUtil.buildResult(ex.getCode(), ex.getMessage());
            } else {
                LOGGER.error(e.getMessage(), e);
                return MessageHandleUtil.buildResult(ReturnCode.FAILURE, ReturnMessage.FAILURE);
            }
        }
        LOGGER.error(e.getMessage(), e);
        return MessageHandleUtil.buildServiceErrorResult();
    }
}
