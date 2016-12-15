package qq.qianfeng.com.qq.model;

import android.content.Context;

import qq.qianfeng.com.qq.entity.UserBean;
import qq.qianfeng.com.qq.utils.SharedUtils;

/**
 * Created by Administrator on 2016/11/30.
 */
public class UserLoginModel implements IUserLoginModel {
    @Override
    public void saveUser(UserBean user) {
        SharedUtils.getInstances().saveUser(user);
    }

    @Override
    public UserBean getUser(Context context) {
        return SharedUtils.getInstances().getUser();
    }

    @Override
    public String getUserName(Context context) {
        UserBean user = getUser(context);
        if (user != null) {
            return user.account;
        }
        return "";
    }

    @Override
    public String getUserPassword(Context context) {
        UserBean user = getUser(context);
        if (user != null) {
            return user.password;
        }
        return "";
    }

    @Override
    public boolean isSavePassword() {
        return SharedUtils.getInstances().isSavePassword();
    }

    @Override
    public boolean isAutoLogin() {
        return SharedUtils.getInstances().isAutoLogin();
    }


}
