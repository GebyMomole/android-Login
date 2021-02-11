package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextUsername,editTextPassword,editName;
    private Button btnLogin;
    private String name,user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent= getIntent();
        user = intent.getStringExtra("user");
        pass = intent.getStringExtra("pass");
        name = intent.getStringExtra("name");

        editTextUsername = findViewById(R.id.editTextusername);
        editTextPassword = findViewById(R.id.editTextpassword);
        btnLogin = findViewById(R.id.btnlogin);
    }

    public void login (View v){
        //statement
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();
        if (!user.equals(username)){
            Toast.makeText(this," username  not valid", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!pass.equals(password)){
            Toast.makeText(this," password not valid", Toast.LENGTH_SHORT).show();
            return;
        }
        if (username.isEmpty() ||password.isEmpty() ){
            Toast.makeText(this,"Please Input your username or password", Toast.LENGTH_SHORT).show();
            return;
        }



        Intent intent = new Intent(this, Home.class);
        intent.putExtra("username",name);
        startActivity(intent);
    }
}