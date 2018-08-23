package com.common_ibrary.retrofit;

import android.content.Context;
import android.util.Log;


import java.io.IOException;


/**
 * 业务名:OkHttp拦截器
 * 功能说明:
 * 编写日期:2017/10/19 下午6:28;
 * 作者:zhangbo;
 * <p/>
 * 历史记录
 * 1、修改日期：
 * 修改人：
 * 修改内容：
 */
//public class CaheInterceptor  {implements Interceptor
public class CaheInterceptor  {

//    private Context context;
//
//    public CaheInterceptor(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public Response intercept(Chain chain) throws IOException {
//        Request request = chain.request();
//        if (RxNetworkTool.isNetworkAvailable(context)) {
//            Response response = chain.proceed(request);
//            // read from cache for 60 s
//            int maxAge = 60;
//            String cacheControl = request.cacheControl().toString();
//            Log.e("CacheInterceptor", "60s load cahe" + cacheControl);
//            return response.newBuilder()
//                    .removeHeader("Pragma")
//                    .removeHeader("Cache-Control")
//                    .header("Cache-Control", "public, max-age=" + maxAge)
//                    .build();
//        } else {
//            Log.e("CacheInterceptor", " no network load cahe");
//            request = request.newBuilder()
//                    .cacheControl(CacheControl.FORCE_CACHE)
//                    .build();
//            Response response = chain.proceed(request);
//            //set cahe times is 3 days
//            int maxStale = 60 * 60 * 24 * 3;
//            return response.newBuilder()
//                    .removeHeader("Pragma")
//                    .removeHeader("Cache-Control")
//                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
//                    .build();
//        }
//    }
}
