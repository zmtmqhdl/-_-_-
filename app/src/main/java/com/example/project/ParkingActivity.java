package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ParkingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking);
        Button back_button = (Button) findViewById(R.id.button44);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), ScanQR.class);
                startActivity(back);
                finish();
            }
        });
        Button button40 = (Button) findViewById(R.id.bt1);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "주차 자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), Off2Activity.class);
                startActivity(off);
                finish();
            }
        });

        Button button41 = (Button) findViewById(R.id.bt2);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "주차 자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), Off2Activity.class);
                startActivity(off);
                finish();
            }
        });
        Button button42 = (Button) findViewById(R.id.bt3);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "주차 자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), Off2Activity.class);
                startActivity(off);
                finish();
            }
        });
        Button button43 = (Button) findViewById(R.id.bt4);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "주차 자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), Off2Activity.class);
                startActivity(off);
                finish();
            }
        });
    }
}
