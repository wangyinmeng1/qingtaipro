package com.example.findpasswordui;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;

/**
 * Created by 金晨 on 2016/4/15.
 */
public class VerifyCodeActivity extends Activity{
    private TimeCount time;
    private Button checking;    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verifycode);
        time = new TimeCount(60000, 1000);//构造CountDownTimer对象
        checking = (Button) findViewById(R.id.getverifycodeagainbutton);
        checking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.start();//开始计时
            }
        });
    }

    public class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);//参数依次为总时长,和计时的时间间隔
        }

        @Override
        public void onFinish() {//计时完毕时触发
            checking.setText("重新获取");
            checking.setClickable(true);
        }

        @Override
        public void onTick(long millisUntilFinished) {//计时过程显示
            checking.setClickable(false);
            checking.setText(millisUntilFinished / 1000 + "秒");
        }
    }
}
