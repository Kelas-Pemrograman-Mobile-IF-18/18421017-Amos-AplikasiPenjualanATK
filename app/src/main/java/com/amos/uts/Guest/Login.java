package com.amos.uts.Guest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.amos.uts.Admin.DashboardAdmin;
import com.amos.uts.R;
import com.amos.uts.User.DashboardUser;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Login extends AppCompatActivity {
    @BindView(R.id.edtUsername)EditText edtUsername;
    @BindView(R.id.edtPassword) EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin) void submit() {
        String username = edtUsername.getText().toString();
        String password = edtPassword.getText().toString();

        if (username.equals("admin") & password.equals("admin")) {
            Intent i = new Intent(Login.this, DashboardAdmin.class);
            startActivity(i);
            finish();
        } else {
            Toast.makeText(getApplicationContext(), "Username & Password Salah", Toast.LENGTH_LONG).show();
        }


    }

    @OnClick(R.id.btnAkun) void login() {
        Intent i = new Intent(Login.this, Register.class);
        startActivity(i);
        finish();
    }
}