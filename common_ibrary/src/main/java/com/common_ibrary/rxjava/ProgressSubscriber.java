package com.common_ibrary.rxjava;

import android.content.Context;
import android.util.Log;



/**
 * 业务名:用于在Http请求开始时，自动显示一个ProgressDialog      在Http请求结束是，关闭ProgressDialog
 * 功能说明:
 * 编写日期:2017/10/23 下午1:16;
 * 作者:zhangbo;
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class ProgressSubscriber<T>  {
//public class ProgressSubscriber<T> implements ProgressCancelListener, Observer<T> {
//
//    private SubscriberOnNextListener mSubscriberOnNextListener;
//    private ProgressDialogHandler mProgressDialogHandler;
//    private Context context;
//    private NetWorkFail netWorkFail;
//    private Disposable disposable;
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:通过boolean控制请求本身的加载动画
//     * @CreateDate: 2017/10/20 上午10:28;
//     * @Version: 1.0;
//     */
//    public ProgressSubscriber(SubscriberOnNextListener mSubscriberOnNextListener, Context context, boolean isLoading, NetWorkFail netWorkFail) {
//        this.mSubscriberOnNextListener = mSubscriberOnNextListener;
//        this.context = context;
//        this.netWorkFail = netWorkFail;
//        if (isLoading) {
//            mProgressDialogHandler = new ProgressDialogHandler(context, this, false);
//        }
//    }
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:显示加载框
//     * @CreateDate: 2017/10/20 上午10:28;
//     * @Version: 1.0;
//     */
//    private void showProgressDialog() {
//        if (mProgressDialogHandler != null) {
//            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.SHOW_PROGRESS_DIALOG).sendToTarget();
//        }
//    }
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:隐藏加载框
//     * @CreateDate: 2017/10/20 上午10:28;
//     * @Version: 1.0;
//     */
//    private void dismissProgressDialog() {
//        if (mProgressDialogHandler != null) {
//            mProgressDialogHandler.obtainMessage(ProgressDialogHandler.DISMISS_PROGRESS_DIALOG).sendToTarget();
//            mProgressDialogHandler = null;
//        }
//    }
//
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:订阅开始时调用，显示ProgressDialog
//     * @CreateDate: 2017/10/20 上午10:27;
//     * @Version: 1.0;
//     */
//    @Override
//    public void onSubscribe(Disposable d) {
//        disposable = d;
//        showProgressDialog();
//    }
//
//
//    /**
//     * @param t 创建Subscriber时的泛型类型
//     * @Author: zhangbo;
//     * @MethodDescription:将onNext方法中的返回结果交给Activity或Fragment自己处理 如果状态码等于200解除订阅-不再接收上游事件
//     * @CreateDate: 2017/10/20 上午10:26;
//     * @Version: 1.0;
//     */
//    @Override
//    public void onNext(T t) {
//        if (mSubscriberOnNextListener != null && t != null) {
//            mSubscriberOnNextListener.onNext(t);
//        }
//    }
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:完成，隐藏ProgressDialog
//     * @CreateDate: 2017/10/20 上午10:27;
//     * @Version: 1.0;
//     */
//    @Override
//    public void onComplete() {
//        dismissProgressDialog();
//        if (disposable != null && !disposable.isDisposed()) {
//            disposable.dispose();
//        }
//    }
//
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:* 对错误进行统一处理 ，隐藏ProgressDialog
//     * @CreateDate: 2017/10/20 上午10:27;
//     * @Version: 1.0;
//     */
//    @Override
//    public void onError(Throwable e) {
//        String errorMsg = null;
//        Log.e("url", e + "------");
//        if (!RxNetworkTool.isNetworkAvailable(context)) {
//            errorMsg = "请检查网络连接";
//        } else if (e instanceof ConnectException) {
//            errorMsg = "服务异常，请重新登录";
//        } else if (e instanceof SocketTimeoutException) {
//            errorMsg = "网络连接超时";
//        } else if (e instanceof NullPointerException) {
//            errorMsg = "服务器异常，请重试";
//            printStackTrace();
//        } else if (e instanceof HttpException) {
//            //网络请求异常
//            switch (((HttpException) e).code()) {
//                case RxHttpStatus.SERVER_ERROR:
//                case RxHttpStatus.SERVER_ERROR_FAILURE_502:
//                case RxHttpStatus.SERVER_ERROR_FAILURE_503:
//                case RxHttpStatus.SERVER_ERROR_FAILURE_504:
//                    errorMsg = "服务器异常，请重试";
//                    break;
//                case RxHttpStatus.SERVER_NO_ACCESS:
//                    errorMsg = "访问被禁止";
//                    break;
//                case RxHttpStatus.SERVER_NOT_FOUND:
//                    errorMsg = "无法找到被请求的页面";
//                    break;
//                case RxHttpStatus.SERVER_REQUEST_TIMEOUT:
//                    errorMsg = "请求超时";
//                    break;
//                default:
//                    errorMsg = "网络错误";
//                    break;
//            }
//
//        } else {
//            Log.e("url", e.toString());
//            printStackTrace();
//        }
////        if (null != rxLoadingTool) {
////            rxLoadingTool.setListener(new OnLoadViewListener() {
////                @Override
////                public void onRetryClick() {
////                    RxToastTool.show(context, "sdfasdfasf");
////                }
////            });
////        }
//        //请求失败时回调接口
//        if (null != netWorkFail) {
//            netWorkFail.onError(e, errorMsg);
//        }
//        dismissProgressDialog();
//    }
//
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:打印当前方法调用堆栈，打印到 ActivityThread.main() 根节点为止
//     * @CreateDate: 2017/10/20 上午10:27;
//     * @Version: 1.0;
//     */
//    public static void printStackTrace() {
//        if (!BuildConfig.LOG_ON)
//            return;
//        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
//        StringBuilder sb = new StringBuilder("printStackTrace:");
//        for (int i = 3; i < stackTrace.length; i++) {
//            if ("android.app.ActivityThread".equals(stackTrace[i].getClassName())
//                    && "main".equals(stackTrace[i].getMethodName()))
//                break;
//            sb.append('\n').append(stackTrace[i].toString());
//        }
//    }
//
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:取消ProgressDialog的时候，取消对observable的订阅，同时也取消了http请求
//     * @CreateDate: 2017/10/20 上午10:26;
//     * @Version: 1.0;
//     */
//    @Override
//    public void onCancelProgress() {
//        if (disposable != null && !disposable.isDisposed()) {
//            disposable.dispose();
//        }
//    }
//
//    /**
//     * @Author: zhangbo;
//     * @MethodDescription:网络请求失败时的回调
//     * @CreateDate: 2017/10/20 上午10:26;
//     * @Version: 1.0;
//     */
//    public interface NetWorkFail {
//        void onError(Throwable e, String errorMsg);
//    }
}