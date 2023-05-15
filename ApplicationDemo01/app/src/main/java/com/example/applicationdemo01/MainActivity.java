package com.example.applicationdemo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 成员变量
    private RatingBar ratingBar;				// 星级评分条
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    // 获取星级评分条
        ratingBar = (RatingBar) findViewById(R.id.ratingBar1);
    // 获取按钮，并添加单击事件监听器
        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                int result = ratingBar.getProgress();		// 获取进度
                float rating = ratingBar.getRating(); 		// 获取等级
                float step = ratingBar.getStepSize() ; 		// 获取每次最少改变多少颗星
                Log.i("星级评分条", "step=" + step + " result=" + result+ " rating=" + rating);
                Toast.makeText(MainActivity.this, "你得到了" + rating+ "颗星", Toast.LENGTH_SHORT).show();
            }
        });
    }
}