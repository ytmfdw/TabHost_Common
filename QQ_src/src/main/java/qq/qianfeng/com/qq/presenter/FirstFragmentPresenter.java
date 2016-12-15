package qq.qianfeng.com.qq.presenter;

import qq.qianfeng.com.qq.model.FirstFragmentModel;
import qq.qianfeng.com.qq.model.IFirstFragmentModel;
import qq.qianfeng.com.qq.view.IFirstFragmentView;

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
