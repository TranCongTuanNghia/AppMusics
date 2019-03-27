package com.example.appmusics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignUpActivity extends AppCompatActivity {
    Button btn_SignUp;
    EditText UserName2,Password2,Password3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        btn_SignUp=(Button) findViewById(R.id.btn_sign_up);
        UserName2=(EditText)findViewById(R.id.UserName2);

        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=UserName2.getText().toString();

            }
        });

    }
}
