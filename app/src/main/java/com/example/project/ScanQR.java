package com.example.project;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class ScanQR extends AppCompatActivity {

    private IntentIntegrator qrScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_qr);

        qrScan = new IntentIntegrator(this);
        qrScan.setOrientationLocked(true); // default가 세로모드인데 휴대폰 방향에 따라 가로, 세로로 자동 변경됩니다.
        qrScan.setPrompt("QR코드를 사각형 안에 넣어주세요.");
        qrScan.initiateScan();
    }

//    @Override
//    public void onBackPressed() {
//        //super.onBackPressed();
//        if (System.currentTimeMillis() > pressedTime + 2000) {
//            pressedTime = System.currentTimeMillis();
//            Toast.makeText(getApplicationContext(), "한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show();
//        }
//        else {
//            finish();
//        }
//    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null) {
            if(result.getContents() == null) {
                finish();
            }
            else {
                if (result.getContents().equals("0001")) {
                    Intent intent1 = new Intent(getApplicationContext(), BusActivity.class);
                    startActivity(intent1);
                    finish();
                }
                else if (result.getContents().equals("0002")) {
                    Intent intent2 = new Intent(getApplicationContext(), Subway1Activity.class);
                    startActivity(intent2);
                    finish();
                }
                else if (result.getContents().equals("0003")) {
                    Intent intent3 = new Intent(getApplicationContext(), Subway2Activity.class);
                    startActivity(intent3);
                    finish();
                }
                else if (result.getContents().equals("0004")) {
                    Intent intent4 = new Intent(getApplicationContext(), ParkingActivity.class);
                    startActivity(intent4);
                    finish();
                }
                else {
                    Intent intent = new Intent(getApplicationContext(), EmptyActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}