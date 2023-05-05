package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name = (EditText)findViewById(R.id.name);
        final EditText Password1 = (EditText)findViewById(R.id.pwd1);
        final EditText Password2 = (EditText)findViewById(R.id.pwd2);
        //性别RadioGroup
        final RadioGroup sex = (RadioGroup)findViewById(R.id.rgSex);
        //爱好CheckBox
        final CheckBox like1 = (CheckBox)findViewById(R.id.like1);
        final CheckBox like2 = (CheckBox)findViewById(R.id.like2);
        final CheckBox like3 = (CheckBox)findViewById(R.id.like3);

        Button btn1 = (Button) findViewById(R.id.btn);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                Bundle bundle=new Bundle();
                bundle.putCharSequence("name", name.getText().toString()); //用户名
                bundle.putCharSequence("pwd1", Password1.getText().toString());
                bundle.putCharSequence("pwd2", Password2.getText().toString());

                //性别的输出
                for (int i = 0; i < sex.getChildCount(); i++) {
                    RadioButton r = (RadioButton) sex.getChildAt(i);
                    if (r.isChecked()) {
                        bundle.putCharSequence("sex", r.getText().toString());
                        break;            //跳出for循环
                    }
                }

                String str = "";                //保存选中的值
                // 特长
                if (like1.isChecked())            //当第一个复选按钮被选中
                    str += like1.getText().toString() + "  ";
                if (like2.isChecked())            //当第一个复选按钮被选中
                    str += like2.getText().toString() + "  ";
                if (like3.isChecked())            //当第一个复选按钮被选中
                    str += like3.getText().toString() + "  ";

                bundle.putCharSequence("hobby", str);

                intent.putExtras(bundle);//将Bundle对象添加到Intent对象中
                startActivity(intent);

            }
        });

    }
}