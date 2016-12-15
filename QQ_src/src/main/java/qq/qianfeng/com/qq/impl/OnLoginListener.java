package qq.qianfeng.com.qq.impl;

import qq.qianfeng.com.qq.entity.UserBean;

/**
 * Created by Administrator on 2016/11/30.
 */
public interface OnLoginListener {
    public void loginSuccess(UserBean user);

    public void loginFailed();
}
