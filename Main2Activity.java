package com.example.hello.mytrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.hello.mytrack.Main3Activity.username;
import static com.example.hello.mytrack.MainActivity.playerList;

public class Main2Activity extends AppCompatActivity {
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //final String s= playerList.get(1);
       // final TextView textView=(TextView)findViewById(R.id.hello);
       // textView.setText(s);
       final EditText editText=(EditText)findViewById(R.id.x);
        final EditText editText1=(EditText)findViewById(R.id.y);
        Button button=(Button)findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(i=0; i< username.size();i++)
                {
                   if()

                }
                Intent intent=new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(intent);
            }
        });

    }

}
