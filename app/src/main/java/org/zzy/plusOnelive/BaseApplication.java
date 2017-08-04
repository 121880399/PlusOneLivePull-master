package org.zzy.plusOnelive;

import android.app.Application;

import com.zzy.quick.net.HttpManager;
import com.zzy.quick.net.NetError;
import com.zzy.quick.net.NetProvider;
import com.zzy.quick.net.RequestHandler;
import com.zzy.quick.utils.Utils;
import com.zzy.quick.utils.log.LogFactory;

import okhttp3.CookieJar;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/**
 * 项目名称: PlusOneLivePull
 * 创建人: 周正一
 * 创建时间：2017/8/4
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //设置全局Log的Tag
        LogFactory.getLogUtil().setGlobalTag("PlusOneLive");
        //初始化unils
        Utils.init(this);
        //创建默认的Provider
        HttpManager.registerProvider(new NetProvider() {
            @Override
            public Interceptor[] configInterceptors() {
                return new Interceptor[0];
            }

            @Override
            public void configHttps(OkHttpClient.Builder builder) {

            }

            @Override
            public CookieJar configCookie() {
                return null;
            }

            @Override
            public RequestHandler configHandler() {
                return null;
            }

            @Override
            public long configConnectTimeoutMills() {
                return 100 * 1000L;
            }

            @Override
            public long configReadTimeoutMills() {
                return 100 * 1000l;
            }

            @Override
            public boolean configLogEnable() {
                return true;
            }

            @Override
            public boolean handleError(NetError error) {
                return false;
            }

            @Override
            public boolean useProgress() {
                return false;
            }
        });
    }
}

