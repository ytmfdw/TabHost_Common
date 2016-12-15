package qq.qianfeng.com.qq.presenter;

import qq.qianfeng.com.qq.model.IThirdFragmentModel;
import qq.qianfeng.com.qq.model.ThirdFragmentModel;
import qq.qianfeng.com.qq.view.IThirdFragmentView;

/**
 * Created by Administrator on 2016/12/1.
 */
public class ThirdFragmentPresenter {
    IThirdFragmentView view;
    IThirdFragmentModel model;

    public ThirdFragmentPresenter(IThirdFragmentView view) {
        this.view = view;
        model = new ThirdFragmentModel();
    }

}
