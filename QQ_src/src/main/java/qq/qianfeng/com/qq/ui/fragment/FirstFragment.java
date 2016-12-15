package qq.qianfeng.com.qq.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import qq.qianfeng.com.qq.R;
import qq.qianfeng.com.qq.presenter.FirstFragmentPresenter;
import qq.qianfeng.com.qq.ui.activity.BaseNetActivity;
import qq.qianfeng.com.qq.view.IFirstFragmentView;

/**
 * Created by Administrator on 2016/11/30 0030.
 */
public class FirstFragment extends BaseNetFragment implements IFirstFragmentView {
    FirstFragmentPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new FirstFragmentPresenter(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void showLoading() {
        BaseNetActivity act = (BaseNetActivity) getActivity();
        act.getShowDialog(true, "正在加载...").show();
    }

    @Override
    public void dismissLoading() {
        BaseNetActivity act = (BaseNetActivity) getActivity();
        act.dismiss();
    }
}
