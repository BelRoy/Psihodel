package org.devidet.psihodel;


import android.app.Activity;
import android.content.Intent;


import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import android.view.View.OnClickListener;
import android.widget.ImageView;


public class PsiActivity extends Activity implements OnClickListener {



    public void onClick(View v) {

    }



    @Override
    public void onBackPressed(){
        stopService(new Intent(this, MyService.class));
        finish();
    }
    public void onCreate(Bundle savedInstanceState) {
        startService(new Intent(this, MyService.class));


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psi);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final ImageView image1 = (ImageView) findViewById(R.id.imageView3);
        image1.setBackgroundResource(R.drawable.animation);
        image1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable anim1 = (AnimationDrawable) image1.getBackground();
                anim1.start();
            }
        });

        final ImageView image2 = (ImageView) findViewById(R.id.imageView4);
        image2.setBackgroundResource(R.drawable.animation);
        image2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimationDrawable anim2 = (AnimationDrawable) image2.getBackground();
                anim2.start();
            }
        });
    }

}




