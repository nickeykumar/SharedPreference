package com.example.anshu.deepika;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ANSHU on 10/2/2016.
 */
public class LoadData extends Activity {
    TextView usernameTextView,passwordTextView;
    public static final String DEFAULT="N/A";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);
        usernameTextView = (TextView)findViewById(R.id.textView2);
        passwordTextView = (TextView)findViewById(R.id.textView4);
    }

    public void load(View view)
    {
        SharedPreferences sharedPreferences =getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        String name= sharedPreferences.getString("name",DEFAULT);
        String password=sharedPreferences.getString("password",DEFAULT);
        if(name.equals(DEFAULT)||password.equals(DEFAULT))
            Toast.makeText(LoadData.this,"DATA NOT FOUND",Toast.LENGTH_LONG).show();
        else {
            Toast.makeText(LoadData.this, "DATA LOADED SUCESSFULLY", Toast.LENGTH_LONG).show();
            usernameTextView.setText(name);
            passwordTextView.setText(password);
        }

    }
}
