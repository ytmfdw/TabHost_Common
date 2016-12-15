package qq.qianfeng.com.qq.impl;

/**
 * 获取接口数据
 */
public interface OnGetDataListener<T> {

    public void onGetDataSuccess(T value);

    public void onGetDataFaild();
}
