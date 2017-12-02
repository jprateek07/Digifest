package com.example.hello.mytrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {
    public static ArrayList<String> username = new ArrayList<String>();
    public static ArrayList<String> mailid= new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        final EditText uname=(EditText)findViewById(R.id.username);
        final EditText mail=(EditText)findViewById(R.id.mailid);
        Button button =(Button)findViewById(R.id.ok);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String un=uname.getText().toString().trim();
                String mid=mail.getText().toString().trim();
                username.add(un);
                mailid.add(mid);
                Intent intent=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(intent);
            }
        });

    }
}
