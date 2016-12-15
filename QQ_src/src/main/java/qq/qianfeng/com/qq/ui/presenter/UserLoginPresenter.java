package qq.qianfeng.com.qq.ui.presenter;

import android.content.Context;

import qq.qianfeng.com.qq.entity.UserBean;
import qq.qianfeng.com.qq.ui.model.IUserLoginModel;
import qq.qianfeng.com.qq.ui.model.UserLoginModel;
import qq.qianfeng.com.qq.ui.view.IUserLoginView;

/**
 * Created by Administrator on 2016/11/30.
 */
public class UserLoginPresenter {
    private IUserLoginView view;
    private IUserLoginModel model;

    Context context;

    public UserLoginPresenter(Context context, IUserLoginView view) {
        this.view = view;
        this.context = context;
        model = new UserLoginModel();
    }

    public void initViews() {
        view.setSavePassword(model.isSavePassword());
        view.setAutoLogin(model.isAutoLogin());
        setUser();
    }

    public void saveUser(UserBean user) {
        model.saveUser(user);
    }

    /**
     * 界面显示用户账号和密码
     */
    public void setUser() {
        view.setUserName(model.getUserName(context));
        view.setUserPasswrod(model.getUserPassword(context));
    }

    public UserBean getUser() {
        return model.getUser(context);
    }

    /**
     * 登录
     *
     * @param user
     */
    public void login(final UserBean user) {
    }
}
