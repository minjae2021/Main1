package com.example.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class email extends MainActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);

    }
    public void onClickSendButton(View v){
        sendmail();
    }

    public void sendmail() {
        EditText company,name,number,content;
        String strcompany,strnumber,strname,strcontent;


        company = (EditText) findViewById(R.id.company);
        name = (EditText) findViewById(R.id.name);
        number= (EditText) findViewById(R.id.number);
        content = (EditText) findViewById(R.id.content);

        strcompany = company.getText().toString();
        strnumber = number.getText().toString();
        strname = name.getText().toString();
        strcontent = content.getText().toString();

        String subject= "상호명 : "+strcompany+"(담당자 : "+strname+")";
        String text = "문의 내용 : \n"+strcontent+"\n"+"전화번호 : "+strnumber;


        Intent emailintent = new Intent(Intent.ACTION_SEND);

        emailintent.setType("message/rfc822");
        emailintent.putExtra(Intent.EXTRA_EMAIL,new String[]{"test@mail.com"});
        emailintent.putExtra(Intent.EXTRA_SUBJECT,subject);
        emailintent.putExtra(Intent.EXTRA_TEXT,text);

        startActivity(emailintent);


    }

    public void onClickBackButton(View v){
        finish();
    }

}
