package com.example.oop13072020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // tạo 1 cá thể từ tập thể sinhvien
        Sinhvien sinhvienA = new Sinhvien("nguyen van a",20,"quan 7");
        Log.d("BBB",sinhvienA.getTen() + " - "+sinhvienA.getTuoi() + " - "+sinhvienA.getQuequan());
    }
}