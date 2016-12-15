package qq.qianfeng.com.qq.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.WindowManager;

import qq.qianfeng.com.qq.R;
import qq.qianfeng.com.qq.entity.UserBean;
import qq.qianfeng.com.qq.utils.SharedUtils;

/**
 * Created by Administrator on 2016/11/30.
 */
public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        if (SharedUtils.getInstances().isAutoLogin()) {
            //自动登录
            UserBean user = SharedUtils.getInstances().getUser();
            if (user != null) {
                login(user);
            } else {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(WelcomeActivity.this, LoginActivty.class);
                        startActivity(intent);
                        finish();
                    }
                }, 2000);
            }
        } else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(WelcomeActivity.this, LoginActivty.class);
                    startActivity(intent);
                    finish();
                }
            }, 2000);

        }
    }

    private void login(final UserBean user) {
    }
}
