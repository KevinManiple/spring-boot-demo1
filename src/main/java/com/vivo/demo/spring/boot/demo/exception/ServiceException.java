package com.vivo.demo.spring.boot.demo.exception;

import com.vivo.demo.spring.boot.demo.constant.HttpConstant.ReturnCode;

/**
 * 业务异常
 * 
 * @author: Kai.Zhao
 */
public class ServiceException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    /** 异常代码 */
    private Integer code;
    
    public Integer getCode() {
        return code == null ? ReturnCode.FAILURE : code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }
    
    public ServiceException() {
        super();
    }
    
    public ServiceException(String message) {
        super(message);
    }
    
    public ServiceException(Integer code, String message) {
        super(message);
        this.code = code;
    }
    
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ServiceException(Throwable cause) {
        super(cause);
    }
}
