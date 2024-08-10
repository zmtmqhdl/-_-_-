package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OffActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off);

        Button off_button = (Button) findViewById(R.id.button14);

        Toast toast = Toast.makeText(this, "하차가 완료되었습니다.", Toast.LENGTH_SHORT);

        off_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast.show();
                Intent InfoIntent = new Intent(getApplicationContext(), ScanQR.class);
                finish();
                startActivity(InfoIntent);
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(getApplicationContext(), ScanQR.class);
        startActivity(intent);
        finish();
        }
}