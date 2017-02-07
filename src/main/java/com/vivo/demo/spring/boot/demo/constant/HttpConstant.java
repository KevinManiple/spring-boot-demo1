package com.vivo.demo.spring.boot.demo.constant;

public class HttpConstant {
    
    /** JSON返回状态码 */
    public static final String STATUS = "status";
    
    /** JSON返回值 */
    public static final String MSG = "msg";
    
    /** JSON返回数据 */
    public static final String DATA = "data";
    
    /** JSON返回数据格式 */
    public static final String APPLICATION_JSON = "application/json;charset=utf-8";
    
    /**
     * 返回值
     * 
     * @author Kai.Zhao
     * @version 1.0
     * @see
     */
    public class ReturnMessage {
        
        public static final String SERVICE_TIME_OUT = "登录超时";
        
        public static final String SUCCESS = "操作成功";
        
        public static final String FAILURE = "操作失败";
        
        public static final String UNKNOWN_FAILURE = "未知错误";
        
        public static final String SERVICE_ERROR = "服务器异常,请稍候再试!";
        
        public static final String CLIENT_INPUT_ERROR = "参数输入错误";
        
        public static final String REQUEST_ILLEGAL = "请求非法";
        
        public static final String ACTIVITY_TIME_ERROR = "不在活动时间内";
    }
    
    /**
     * 返回码
     * 
     * @author Kai.Zhao
     * @version 1.0
     * @see
     */
    public class ReturnCode {
        
        /** 成功 */
        public static final int SUCCESS = 200;
        
        /** 服务器异常 */
        public static final int SERVICE_ERROR = 500;
        
        /** 请求非法 */
        public static final int REQUEST_ILLEGAL = 501;
        
        /** 超时 */
        public static final int SERVICE_TIME_OUT = 502;
        
        /** 失败 */
        public static final int FAILURE = 600;
        
        /** 客户端输入错误 */
        public static final int CLIENT_INPUT_ERROR = 601;
    }
}
