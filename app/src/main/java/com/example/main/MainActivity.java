package com.example.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("블로그동스쿨 광고센터");
    }
    public void onButton1Clicked(View v){
        Intent intent1 = new Intent(getApplicationContext(),adcenter.class);
        startActivity(intent1);
    }

    public void onButton2Clicked(View v){
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pf.kakao.com/_gxdWWC"));
        startActivity(intent2);
    }

    public void onButton3Clicked(View v){
        Intent intent3 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://blogdong.com/adcenter/join.php"));
        startActivity(intent3);
    }

    public void onButton4Clicked(View v){
        Intent intent4 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://blogdong.com/adcenter/index.php"));
        startActivity(intent4);
    }

    public void onButton5Clicked(View v){
        Intent intent5 = new Intent(getApplicationContext(),email.class);
        startActivity(intent5);
    }

    public void onButton6Clicked(View v){
        Intent intent6 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:/070-4700-9000"));
        startActivity(intent6);
    }
}
