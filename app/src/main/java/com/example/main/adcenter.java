package com.example.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class adcenter extends Activity {

    @Override
    protected void onCreate(Bundle saveInstanceState) {

        super.onCreate(saveInstanceState);
        setContentView(R.layout.adcenter);
    }

    public void onButton7Clicked(View v){
        finish();
    }

}
