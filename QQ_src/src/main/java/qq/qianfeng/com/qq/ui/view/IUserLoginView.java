package qq.qianfeng.com.qq.ui.view;

/**
 * Created by Administrator on 2016/11/30.
 */
public interface IUserLoginView {
    public void setUserName(String name);

    public void setUserPasswrod(String passrod);

    public void showLoading();

    public void dismissLoading();

    public void setSavePassword(boolean falg);

    public void setAutoLogin(boolean falg);

    public void setTitle(String title);

}
