package qq.qianfeng.com.qq;

import android.app.Application;

import org.greenrobot.eventbus.EventBus;

import qq.qianfeng.com.qq.entity.UserBean;

/**
 * Created by Administrator on 2016/11/30.
 */
public class QQApp extends Application {

    static QQApp app;
    public static UserBean user;
    EventBus msgBus = new EventBus();

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public EventBus getMsgBus() {
        return msgBus;
    }

    public static QQApp getInstence() {
        return app;
    }

}
