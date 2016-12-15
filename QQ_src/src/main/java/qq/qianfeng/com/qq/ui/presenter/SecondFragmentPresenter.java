package qq.qianfeng.com.qq.ui.presenter;

import qq.qianfeng.com.qq.ui.model.ISecondFragmentModel;
import qq.qianfeng.com.qq.ui.model.SecondFragmentModel;
import qq.qianfeng.com.qq.ui.view.ISecondFragmentView;

/**
 * Created by Administrator on 2016/12/1.
 */
public class SecondFragmentPresenter {
    ISecondFragmentView view;
    ISecondFragmentModel model;

    public SecondFragmentPresenter(ISecondFragmentView view) {
        this.view = view;
        model = new SecondFragmentModel();
    }


}
