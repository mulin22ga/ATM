package com.example.user.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText edUserid;
    private EditText edPassword;
    private String userid;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public  void  Login(View view) {
        edUserid = findViewById(R.id.ed_userid);
        edPassword = findViewById(R.id.ed_password);
        userid = edUserid.getText().toString();
        password = edPassword.getText().toString();
if("aaa".equals(userid)&&"123".equals((password))) {
    setResult(RESULT_OK);
    finish();
}
    }
    }
