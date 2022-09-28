package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Username,Password;
    Button Btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.et_username);
        Password = findViewById(R.id.et_password);
        Btnlogin = findViewById(R.id.btn_login);

        Btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //isi action button
                //Toast.makeText(getApplicationContext(),"Tombol telah di klik",Toast.LENGTH_SHORT).show();

                String email = Username.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if (email.isEmpty()){
                    Username.setError("Username/email wajib diisi");
                    return;
                }
                if (password.isEmpty()){
                    Password.setError("password harus diiisi");
                    return;
                }
                Intent intent = new Intent(MainActivity.this, layout2.class);
                startActivity(intent);
            }
        });
    }
}