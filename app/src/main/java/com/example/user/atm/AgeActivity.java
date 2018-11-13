package com.example.user.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }
    public void next (View view) {
        EditText edAge = findViewById(R.id.edAge);
        String age = edAge.getText().toString();
        getSharedPreferences("USER",MODE_PRIVATE)
                .edit()
                .putString("AGE",age)
                .apply();

    }
}
