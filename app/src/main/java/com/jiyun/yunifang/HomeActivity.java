package com.jiyun.yunifang;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        System.out.print("我在homeAct的onCreate方法里");
        System.out.print("我在靳国的分支上");

    }
}
