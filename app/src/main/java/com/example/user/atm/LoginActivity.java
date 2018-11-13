package com.example.user.atm;

import android.content.Intent;
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
        edUserid = findViewById(R.id.ed_userid);
        edPassword = findViewById(R.id.ed_password);
        String userid = getSharedPreferences("ATM",MODE_PRIVATE)
             .getString("USERID","");
        edUserid.setText(userid);

    }
    public  void  Login(View view) {
       //  edUserid = findViewById(R.id.ed_userid);
       // edPassword = findViewById(R.id.ed_password);
        userid = edUserid.getText().toString();
        password = edPassword.getText().toString();
if("aaa".equals(userid)&&"123".equals((password))) {
    //如果成功登入會存檔案
    getSharedPreferences("ATM",MODE_PRIVATE)
            .edit()
            .putString("USERID",userid)
            .apply();
    setResult(RESULT_OK);
    finish();
}else {
    setResult(RESULT_CANCELED);
    finish();
}
    }
    }
