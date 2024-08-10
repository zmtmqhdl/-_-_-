package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BusActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bus);

        Button back_button = (Button) findViewById(R.id.button3);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), ScanQR.class);
                startActivity(back);
                finish();
            }
        });
        // 여기부터
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        // 여기까지
        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
    }
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), ScanQR.class);
        startActivity(intent);
        finish();
    }
}