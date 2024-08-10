package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    private FirebaseAuth mAuth;
    private FirebaseUser currentUser;
    EditText etEmail, etPW;
    public int count = 1;

    Dialog dialog;

    public void onStart() {
        super.onStart();
        currentUser = mAuth.getCurrentUser();
        if(currentUser != null){

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        dialog = new Dialog(LoginActivity.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // 타이틀 제거
        dialog.setContentView(R.layout.test_layout);

        mAuth = FirebaseAuth.getInstance();

        etEmail = findViewById(R.id.editTextTextEmailAddress);
        etPW = findViewById(R.id.editTextTextEmailAddress4);

        ImageView image = (ImageView) dialog.findViewById(R.id.image);

        Button manual_button = (Button) findViewById(R.id.button2);
        manual_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
                image.setImageResource(R.drawable.pic1); // 사용설명서
            }
        });

        Button next_button = (Button) dialog.findViewById(R.id.next_button);
        next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                count++;
                if (count == 1) {
                    image.setImageResource(R.drawable.pic1);
                }
                else if (count == 2) {
                    image.setImageResource(R.drawable.pic2);
                }
                else if (count == 3) {
                    image.setImageResource(R.drawable.pic3);
                }
                else if (count == 4) {
                    image.setImageResource(R.drawable.pic4);
                    next_button.setText("종료");
                }
                else {
                    dialog.dismiss();
                    count = 1;
                    next_button.setText("다음");
                }
            }
        });

        Button LoginButton = (Button) findViewById(R.id.button);
        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = etEmail.getText().toString().trim();
                String pwd = etPW.getText().toString().trim();

                if (email.equals("")) {
                    Toast.makeText(LoginActivity.this, "이메일을 입력해 주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (pwd.equals("")) {
                    Toast.makeText(LoginActivity.this, "비밀번호를 입력해 주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                mAuth.signInWithEmailAndPassword(email, pwd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //이메일, 비밀번호 잘못 입력시 클릭하고 여기까지 들어와서 else문까지 가는 데에 3분 이상 걸리는 이유 아직 못 찾음.
                        //제대로 입력하면 if문으로 바로 들어감.

                        if (task.isSuccessful()) {
                            Toast.makeText(LoginActivity.this, "로그인 되었습니다.", Toast.LENGTH_SHORT).show();
                            finish();
                            Intent intent = new Intent(getApplicationContext(), ScanQR.class);
                            startActivity(intent);
                        } else {
                            Toast.makeText(LoginActivity.this, "가입되지 않은 계정이거나 정보 재입력해주세요.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }

    private void reload() {
        Intent SelectIntent = new Intent(getApplicationContext(), ScanQR.class);
        finish();
        startActivity(SelectIntent);
    }
}