package com.baway.fuzhiyan.fuzhiyan20170807;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TopBar topbar = (TopBar) findViewById(R.id.MyTopbar);


        //添加topbar的事件
        topbar.setOnTopBarClickListener(new TopBar.topbarClickListener() {
            @Override
            public void leftClick() {
                Toast.makeText(MainActivity.this, "点击了返回", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void rightClick() {
                Toast.makeText(MainActivity.this, "点击了更多", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
