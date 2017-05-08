package cn.edu.gdmec.s07150826.shiwu;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Administrator on 2017/4/21.
 */
public class WelcomeActivity extends Activity {

    private ImageView mWelcomeIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weicome);

        mWelcomeIv = (ImageView)findViewById(R.id.welcome_iv);

        ObjectAnimator animator = ObjectAnimator.ofFloat(mWelcomeIv,"alpha",0.7f,1.0f);

        animator.setDuration(5000);

        animator.start();

        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation){
                super.onAnimationEnd(animation);
                Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
