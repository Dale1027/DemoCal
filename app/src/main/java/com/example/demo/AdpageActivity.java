package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Bundle;
import android.os.Message;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.prefs.PreferencesFactory;

public class AdpageActivity extends Activity {


    TextView countTime;
    int count=5;
    Animation animatable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adpage);

        countTime=findViewById(R.id.tw_count);
        animatable= (Animation) AnimationUtils.loadAnimation(this,R.anim.animation_text);
        //textView.startAnimation(animation);
        handler.sendEmptyMessageDelayed(0, 1000);

    }
    private int getCount() {
        count--;
        if (count == 0) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        return count;
    }


    private Handler handler=new Handler(){
       public void handleMessage(Message msg) {
           if (msg.what == 0) {
               countTime.setText(getCount()+"");
               handler.sendEmptyMessageDelayed(0, 1000);
               animatable.reset();
               countTime.startAnimation(animatable);
           }

       };

   };

    
}
