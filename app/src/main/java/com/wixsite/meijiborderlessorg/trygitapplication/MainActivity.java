package com.wixsite.meijiborderlessorg.trygitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //R.layout.紐づけたいxml（画面）の名前
        setContentView(R.layout.activity_main);


        TextView textView = findViewById(R.id.textView);
        textView.setText("GitSampleProgram");


        //画面のview(アイテム)を取得
        Button buttonTaka = findViewById(R.id.buttonTaka);
        Button buttonTani = findViewById(R.id.buttonTani);
        Button buttonYama = findViewById(R.id.buttonYama);

        //ボタン機能の実装　onClickまでは定型、onClick(View view){処理したい内容を記述}
        buttonTaka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TakaActivity.class);
                startActivity(intent);
                }
        });

        buttonTani.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TaniActivity.class);
                startActivity(intent);
            }
        });

        buttonYama.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, YamaActivity.class);
                startActivity(intent);
            }
        });

    }

}
