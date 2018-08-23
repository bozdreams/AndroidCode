package com.common_ibrary.rxjava;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;



/**
 * 业务名:
 * 功能说明:
 * 编写日期:2017/10/23 下午1:16;
 * 作者:zhangbo;
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
public class ProgressDialogHandler extends Handler {

//    public static final int SHOW_PROGRESS_DIALOG = 1;
//    public static final int DISMISS_PROGRESS_DIALOG = 2;
//    private LoadingDialog pd;
//    private Context context;
//    private boolean cancelable;
//    private ProgressCancelListener mProgressCancelListener;
//
//    public ProgressDialogHandler(Context context, ProgressCancelListener mProgressCancelListener,
//                                 boolean cancelable) {
//        super();
//        this.context = context;
//        this.mProgressCancelListener = mProgressCancelListener;
//        this.cancelable = cancelable;
//    }
//
//    private void initProgressDialog(){
//        try{
//            if (pd == null) {
//                pd = new LoadingDialog();
//                pd.setmProgressCancelListener(mProgressCancelListener);
//                pd.setCanceled(cancelable);
//                pd.show(((FragmentActivity)context).getSupportFragmentManager(),"view_loading");
//            }
//        }catch (Exception e){
//
//        }
//    }
//
//    private void dismissProgressDialog(){
//        if (pd != null) {
//            pd.hideload();
//            pd = null;
//        }
//    }
//
//    @Override
//    public void handleMessage(Message msg) {
//        switch (msg.what) {
//            case SHOW_PROGRESS_DIALOG:
//                initProgressDialog();
//                break;
//            case DISMISS_PROGRESS_DIALOG:
//                dismissProgressDialog();
//                break;
//            default:
//                break;
//        }
//    }

}
