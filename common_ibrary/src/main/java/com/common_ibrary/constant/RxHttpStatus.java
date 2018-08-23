package com.common_ibrary.constant;

/**
 * 业务名:
 * 功能说明:网络请求状态码
 * 编写日期:2018/4/17 下午4:56;
 * 作者:zhangbo;
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */

public class RxHttpStatus {

    //请求成功
    public final static int SERVER_SUCCESS = 0;

    //未登录
    public final static int SERVER_NO_LOGIN = 208;

    //参数不合法
    public final static int SERVER_NO_LEGAL_PARAMMETER = 209;

    //访问被禁止
    public final static int SERVER_NO_ACCESS = 403;

    //服务器无法找到被请求的页面。
    public final static int SERVER_NOT_FOUND = 404;

    //请求超出了服务器的等待时间
    public final static int SERVER_REQUEST_TIMEOUT = 408;

    //服务器错误
    public final static int SERVER_ERROR = 500;

    //请求未完成。服务器从上游服务器收到一个无效的响应。
    public final static int SERVER_ERROR_FAILURE_502 = 502;

    //请求未完成。服务器临时过载或当机。
    public final static int SERVER_ERROR_FAILURE_503 = 503;

    //请求未完成。网关超时
    public final static int SERVER_ERROR_FAILURE_504 = 504;

    //签名错误
    public final static int SERVER_SIGNATURE_ERROR = 600;

}
