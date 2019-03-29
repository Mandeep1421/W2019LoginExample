package com.mandy.w2019loginexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //|Read the values passed from previous activity
        Bundle mBundle =   getIntent().getExtras();
        if(mBundle != null)//verify
        {
           if(mBundle.containsKey("Name"))//verify
           {
               String name =  mBundle.getString("Name");
               Toast.makeText(this,name, Toast.LENGTH_LONG).show();
           }
        }
      //getString("Name");
    }
}
