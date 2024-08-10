package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Subway1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subway1);
        Button back_button = (Button) findViewById(R.id.button9);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(getApplicationContext(), ScanQR.class);
                startActivity(back);
                finish();
            }
        });
        Button button10 = (Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });

        Button button11 = (Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button12 = (Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button15 = (Button) findViewById(R.id.button15);
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button21 = (Button) findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button22 = (Button) findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button23 = (Button) findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"자리 선택이 완료되었습니다.", Toast.LENGTH_LONG).show();
                Intent off = new Intent(getApplicationContext(), OffActivity.class);
                startActivity(off);
                finish();
            }
        });
        Button button24 = (Button) findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
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