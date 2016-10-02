package com.example.anshu.deepika;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);

    }

    public void save(View view)
    {

      // Toast.makeText(MainActivity.this,"WELCOME TO SAVE", Toast.LENGTH_LONG).show();
       SharedPreferences sharedPreferences=getSharedPreferences("Mydata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("name",username.getText().toString());
        editor.putString("password",password.getText().toString());
        editor.commit();
        Toast.makeText(MainActivity.this,"DATA INSERTED", Toast.LENGTH_LONG).show();
    }


    public void next(View view){
        //Toast.makeText(MainActivity.this,"WELCOME TO NEXT", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,LoadData.class);
        startActivity(intent);
    }

}
