package com.mandy.w2019loginexample;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity
{
    private EditText editEmail;
    private EditText editPassword;
    private Button BtnLogin;
    private Button BtnClr;
    private TextView txtMsg;
    String Pass;
    String email;
    String lblError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmail = findViewById(R.id.editEmail);
        editPassword = findViewById(R.id.editPassword);
        txtMsg = findViewById(R.id.txtMsg);

        BtnLogin = findViewById(R.id.BtnLogin);
        BtnClr = findViewById(R.id.btnClr);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                email = editEmail.getText().toString();
                Pass = editPassword.getText().toString();

                if(email.equals("Admin")  && Pass.equals("123"))
                {
                    txtMsg.setTextColor(Color.GREEN);
                    lblError = "Login SuccessFull";

                    //Navigate to next screen
                    Intent mIntent = new Intent(LoginActivity.this, HomeActivity.class);

                    //Set value to pass the  screen
                    mIntent.putExtra("Name", "Mandeep Kaur");
                    startActivity(mIntent);

                }
                else
                {
                    txtMsg.setTextColor(Color.RED);
                    lblError = "Invalid Username or Password!";
                }
                txtMsg.setText(lblError.toString());
                BtnClr.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        editEmail.getText().clear();
                        editPassword.getText().clear();
                    }
                });



                String email = editEmail.getText().toString();
                //Toast.makeText(getApplicationContext(), email, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
