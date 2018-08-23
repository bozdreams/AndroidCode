package com.common_ibrary.retrofit;



import com.common_ibrary.constant.RxHttpAddress;

import java.util.ArrayList;
import java.util.Map;


/**
 * 业务名:使用Retrofit+RxJava实现网络请求
 * 功能说明:
 * 编写日期: 2017/10/19 下午5:16
 * 作者:zhangbo
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public interface RxMovieService {

//    //微信支付
//    @GET(RxHttpAddress.WxChatPay)
//    /**zhangbo*/
//    Observable<BaseResult<WeChatEntity>> getWeChat(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //支付宝支付
//    @GET(RxHttpAddress.rechargeList)
//    /**zhangbo*/
//    Observable<BaseResult<ArrayList<RechargeListEntity>>> getRechargeList(@Query("token") String token);
//
//    //充值配置
//    @GET(RxHttpAddress.AliPay)
//    /**zhangbo*/
//    Observable<BaseResult> getAliPay(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //注册
//    @POST(RxHttpAddress.getRegister)
//    /**zhangbo*/
//    Observable<BaseResult> getRegister(@QueryMap Map<String, Object> parameter);
//
//    //登录
//    @POST(RxHttpAddress.getLogin)
//    /**zhangbo*/
//    Observable<BaseResult<LoginEntity>> getLogin(@QueryMap Map<String, Object> parameter);
//
//    //忘记密码
//    @POST(RxHttpAddress.getForgetPsd)
//    /**zhangbo*/
//    Observable<BaseResult> getForgetPsd(@QueryMap Map<String, Object> parameter);
//
//    //用户信息
//    @GET(RxHttpAddress.getUserInfo)
//    /**zhangbo*/
//    Observable<BaseResult<UserInfoEntity>> getUserInfo(@Query("token") String token);
//
//    //修改密码
//    @PUT(RxHttpAddress.getRevisePsd)
//    /**zhangbo*/
//    Observable<BaseResult> getRevisePsd(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //修改用户信息
//    @PUT(RxHttpAddress.getReviseUserInfo)
//    /**zhangbo*/
//    Observable<BaseResult> getReviseUserInfo(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //修改用户信息
//    @GET(RxHttpAddress.getVerifyCode)
//    /**zhangbo*/
//    Observable<BaseResult> getVerifyCode(@QueryMap Map<String, Object> parameter);
//
//
//    //我的报告列表
//    @GET(RxHttpAddress.getReportList)
//    /**zhangbo*/
//    Observable<BaseResult<ArrayList<MineReportEntity>>> getReportList(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //获取最新检测报告(3天)
//    @GET(RxHttpAddress.getRecentReportList)
//    /**zhangbo*/
//    Observable<BaseResult<ArrayList<MineReportEntity>>> getRecentReportList(@Query("token") String token);
//
//
//    //账户余额-检测记录
//    @GET(RxHttpAddress.getRecordList)
//    /**zhangbo*/
//    Observable<BaseResult<ArrayList<RecordHistoryEntity>>> getRecordList(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//
//    //健康档案列表
//    @GET(RxHttpAddress.getHealthList)
//    /**zhangbo*/
//    Observable<BaseResult<ArrayList<HealthListEntity>>> getHealthList(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //删除-健康档案列表
//    @DELETE(RxHttpAddress.getDeleteHealth)
//    /**zhangbo*/
//    Observable<BaseResult> getDeleteHealth(@Path("id") int id, @Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //创建-健康档案
//    @POST(RxHttpAddress.getCreateHealth)
//    /**zhangbo*/
//    Observable<BaseResult> getCreateHealth(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //删除-健康档案列表
//    @PUT(RxHttpAddress.getReviseHealth)
//    /**zhangbo*/
//    Observable<BaseResult> getReviseHealth(@Path("id") int id, @Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //添加-健康档案列表
//    @POST(RxHttpAddress.getAddHealth)
//    /**zhangbo*/
//    Observable<BaseResult> getAddHealth(@Path("id") int id, @Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //查询-健康档案列表
//    @GET(RxHttpAddress.getOtherHealth)
//    /**zhangbo*/
//    Observable<BaseResult<HealthListEntity>> getOtherHealth(@Path("id") int id, @Query("token") String token);
//
//    //查询我的设备
//    @GET(RxHttpAddress.getDevice)
//    /**zhangbo*/
//    Observable<BaseResult<DeviceEntity>> getDevice(@Query("token") String token);
//
//    //根据加密串获得设备编码
//    @GET(RxHttpAddress.getDeviceCode)
//    /**zhangbo*/
//    Observable<BaseResult> getDeviceCode(@Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //解绑我的设备
//    @DELETE(RxHttpAddress.getRemoveDevice)
//    /**zhangbo*/
//    Observable<BaseResult> getRemoveDevice(@Path("equipmentcode") String id, @Query("token") String token, @QueryMap Map<String, Object> parameter);
//
//    //解绑我的设备
//    @POST(RxHttpAddress.getBindingDevice)
//    /**zhangbo*/
//    Observable<BaseResult> getBindingDevice(@Path("equipmentcode") String id, @Query("token") String token, @QueryMap Map<String, Object> parameter);

}
