package com.amos.uts.Guest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.amos.uts.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().hide();
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnRegister) void submit() {
        Intent i = new Intent(Register.this, Login.class);
        startActivity(i);
        finish();
    }

    @OnClick(R.id.btnAkun) void login() {
        Intent i = new Intent(Register.this, Login.class);
        startActivity(i);
        finish();
    }
}