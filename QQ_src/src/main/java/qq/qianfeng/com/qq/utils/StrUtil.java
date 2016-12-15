package qq.qianfeng.com.qq.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/8.
 */
public class StrUtil {
    /**
     * 取空字符串
     *
     * @param str
     * @return
     */
    public static String isNull(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    /**
     * 返回时间：2016-12-08 14:00
     *
     * @param time
     * @return
     */
    public static String getStringByTime(long time) {
        Date date = new Date();
        date.setTime(time);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(date);
    }

}
