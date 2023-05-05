package com.example.application;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_main);
        final TextView user = (TextView) findViewById(R.id.name);
        final TextView pwd1 = (TextView) findViewById(R.id.pwd1);
        final TextView pwd2 = (TextView) findViewById(R.id.pwd2);
        final TextView sex = (TextView) findViewById(R.id.sex);
        final TextView hobby = (TextView) findViewById(R.id.hobby);

        Intent intent=getIntent(); //获取Intent对象
        Bundle bundle= ((Intent) intent).getExtras();  //获取传递的数据包
        user.setText(bundle.getString("name"));
        pwd1.setText(bundle.getString("pwd1"));
        pwd2.setText(bundle.getString("pwd2"));
        sex.setText(bundle.getString("sex"));
        hobby.setText(bundle.getString("hobby"));

    }
}