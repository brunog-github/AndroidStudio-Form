package com.example.formtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterClick(View view) {
        EditText editTxtName = findViewById(R.id.editTxtName);
        EditText editTxtLastName = findViewById(R.id.editTextLastName);
        EditText editTxtPhone = findViewById(R.id.editTxtPhone);
        EditText editTxtEmail = findViewById(R.id.editTxtEmail);

        TextView txtName = findViewById(R.id.txtName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);

        String userName = editTxtName.getText().toString();
        String userLastName = editTxtLastName.getText().toString();
        String userEmail = editTxtEmail.getText().toString();
        String userPhone = editTxtPhone.getText().toString();

        txtName.setText("Nome: " + userName);
        txtLastName.setText("Sobrenome: " + userLastName);
        txtEmail.setText("Email: " + userEmail);
        txtPhone.setText("Telefone: " + userPhone);
    }
}