package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    private EditText editUser,editName,editPass,comPass;
    private Button btnregis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editUser = findViewById(R.id.editUser);
        editName = findViewById(R.id.editNama);
        editPass = findViewById(R.id.editpassword);
        comPass = findViewById(R.id.editCpass);
    }

    public void Register(View v){
        String user = editUser.getText().toString();
        String name = editName.getText().toString();
        String pass = editPass.getText().toString();
        String cpass = comPass.getText().toString();

        if(user.isEmpty()||name.isEmpty()||pass.isEmpty()||cpass.isEmpty()){
            Toast.makeText(this, "Please Input your data", Toast.LENGTH_SHORT).show();
            return;
        }
        if(!pass.equals(cpass)){
            Toast.makeText(this,"Incorrect Password",Toast.LENGTH_SHORT).show();
            return;
        }


        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("user",user);
        intent.putExtra("name",name);
        intent.putExtra("pass",pass);
        intent.putExtra("cpass",cpass);
        startActivity(intent);


    }
}