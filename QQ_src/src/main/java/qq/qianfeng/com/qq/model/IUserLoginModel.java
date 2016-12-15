package qq.qianfeng.com.qq.model;

import android.content.Context;

import qq.qianfeng.com.qq.entity.UserBean;

/**
 * Created by Administrator on 2016/11/30.
 */
public interface IUserLoginModel {
    /**
     * 保存用户
     *
     * @param user
     */
    public void saveUser(UserBean user);

    /**
     * 获取用户
     *
     * @param context
     * @return
     */
    public UserBean getUser(Context context);

    public String getUserName(Context context);

    public String getUserPassword(Context context);

    public boolean isSavePassword();

    public boolean isAutoLogin();

}
