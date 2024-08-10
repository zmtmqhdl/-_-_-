package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Subway2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subway2);
        Button back_button = (Button) findViewById(R.id.button25);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), ScanQR.class);
                startActivity(back);
                finish();
            }
        });
        Button button29 = (Button) findViewById(R.id.button29);
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button30 = (Button) findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button31 = (Button) findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button32 = (Button) findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button26 = (Button) findViewById(R.id.button26);
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button33 = (Button) findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button38 = (Button) findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button39 = (Button) findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button27 = (Button) findViewById(R.id.button27);
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button28 = (Button) findViewById(R.id.button28);
        button28.setOnClickListener(new View.OnClickListener() {
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