package com.mandy.w2019loginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText editEmail;
    private EditText editPassword;
    private Button BtnLogin;
    private Button Btnsignup;
    private TextView txtMsg;
    String Pass;
    String email;
    String lblError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        txtMsg = findViewById(R.id.txtMsg);

        BtnLogin = findViewById(R.id.BtnLogin);
        Btnsignup = findViewById(R.id.btnsignup);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                email = editEmail.getText().toString();
                Pass = editPassword.getText().toString();

                if(email.equals("Admin")  && Pass.equals("123"))
                {
                    lblError = "Login SuccessFull";

                }
                else
                {
                    lblError = "Invalid Username or Password!";
                }
                txtMsg.setText(lblError.toString());

                String email = editEmail.getText().toString();
                Toast.makeText(getApplicationContext(), email, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
