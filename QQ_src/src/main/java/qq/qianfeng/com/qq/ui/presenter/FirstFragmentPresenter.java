package qq.qianfeng.com.qq.ui.presenter;

import qq.qianfeng.com.qq.ui.model.FirstFragmentModel;
import qq.qianfeng.com.qq.ui.model.IFirstFragmentModel;
import qq.qianfeng.com.qq.ui.view.IFirstFragmentView;

/**
 * Created by Administrator on 2016/12/1.
 */
public class FirstFragmentPresenter {
    IFirstFragmentView view;
    IFirstFragmentModel model;

    public FirstFragmentPresenter(IFirstFragmentView view) {
        this.view = view;
        model = new FirstFragmentModel();
    }


}
