package qq.qianfeng.com.qq.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import qq.qianfeng.com.qq.R;


/**
 * Created by Administrator on 2016/12/9.
 */
public class LoadingView extends LinearLayout {
    ImageView iv;

    TextView tv;

    RotateAnimation anim;

    public LoadingView(Context context) {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setGravity(Gravity.CENTER);
        setOrientation(VERTICAL);
        LayoutInflater.from(getContext()).inflate(R.layout.loading_view, this, true);
        iv = (ImageView) findViewById(R.id.iv);
        tv = (TextView) findViewById(R.id.tv);

//        AnimationDrawable anim= (AnimationDrawable) iv.getDrawable();
//        anim.start();

        if (anim == null) {
            anim = new RotateAnimation(0, 360, RotateAnimation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            anim.setDuration(3000);
            anim.setInterpolator(new LinearInterpolator());
            anim.setRepeatCount(Animation.INFINITE);
        }
        iv.startAnimation(anim);

    }

    public void setText(String str) {
        tv.setText(str);
    }

    public void setText(int resId) {
        tv.setText(resId);
    }


}
