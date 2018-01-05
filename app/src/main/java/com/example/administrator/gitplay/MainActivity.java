package com.example.administrator.gitplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn_click);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //第三次
                Intent intent=new Intent(MainActivity.this,FirstActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"跳转!",Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
