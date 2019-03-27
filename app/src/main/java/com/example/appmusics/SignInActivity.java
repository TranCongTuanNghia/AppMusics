package com.example.appmusics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    private EditText mUserName,mPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mUserName=(EditText) findViewById(R.id.UserName1);
        mPassword=(EditText) findViewById(R.id.Password1);

        Button btn_sign_in= (Button) findViewById(R.id.btn_sign_in);
        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String UserName=mUserName.getText().toString();
                String Pass=mPassword.getText().toString();
                if (UserName.equalsIgnoreCase("Musicofme") && Pass.equals("Musicofme123")){
                    Intent Profileintent=new Intent(SignInActivity.this,ProfileActivity.class);
                    startActivity(Profileintent);
                    Toast.makeText(SignInActivity.this,"Ban da dang nhap thanh cong",Toast.LENGTH_LONG).show();
                }else
                    Toast.makeText(SignInActivity.this,"ban khong dang nhap thanh cong",Toast.LENGTH_LONG).show();
            }
        });
        Button btn_register=(Button) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Registerintent=new Intent(SignInActivity.this,SignUpActivity.class);
                startActivity(Registerintent);
            }
        });
    }
}
