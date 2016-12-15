package qq.qianfeng.com.qq.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import qq.qianfeng.com.qq.QQApp;
import qq.qianfeng.com.qq.R;
import qq.qianfeng.com.qq.entity.UserBean;
import qq.qianfeng.com.qq.impl.OnLoginListener;
import qq.qianfeng.com.qq.presenter.UserLoginPresenter;
import qq.qianfeng.com.qq.utils.SharedUtils;
import qq.qianfeng.com.qq.view.IUserLoginView;

/**
 * 登录界面
 */
public class LoginActivty extends BaseNetActivity implements IUserLoginView {


    @BindView(R.id.et_name)
    EditText etName;
    @BindView(R.id.et_password)
    EditText etPassword;

    UserLoginPresenter presenter;
    @BindView(R.id.cb_save)
    CheckBox cbSave;
    @BindView(R.id.cb_auto)
    CheckBox cbAuto;
//    @BindView(R.id.title)
//    TextView title;

    @Override
    public void setLayout() {
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @Override
    public void initViews() {
        super.initViews();
        presenter = new UserLoginPresenter(this, this);
        //初始化界面
//        presenter.setUser();
        presenter.initViews();
    }

    @Override
    public void setUserName(String name) {
        etName.setText(name);
    }

    @Override
    public void setUserPasswrod(String passrod) {
        etPassword.setText(passrod);
    }

    @Override
    public void showLoading() {
        getShowDialog(false, "登录...").show();
    }

    @Override
    public void dismissLoading() {
        dismiss();
    }

    @Override
    public void setSavePassword(boolean falg) {
        cbSave.setChecked(falg);
    }

    @Override
    public void setAutoLogin(boolean falg) {
        cbAuto.setChecked(falg);
    }

    @Override
    public void setTitle(String title) {
        /*this.title.setText(title);*/
    }

    public void doLogin(View view) {
        UserBean user = new UserBean();
        user.account = etName.getText().toString();
        user.password = etPassword.getText().toString();
        presenter.login(user);

        //测试，跳转到主界面
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @OnClick({R.id.cb_save, R.id.cb_auto})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cb_save:
                SharedUtils.getInstances().setSavePassword(cbSave.isChecked());
                break;
            case R.id.cb_auto:
                SharedUtils.getInstances().setAutoLogin(cbAuto.isChecked());
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
