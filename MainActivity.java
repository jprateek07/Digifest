package com.example.hello.mytrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText txt1;
    public static ArrayList<String> playerList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //txt1=(EditText)findViewById(R.id.edit);
        Button button=(Button)findViewById(R.id.button);

       // final TextView t1=(TextView)findViewById(R.id.hello);
        /*button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ag=txt1.getText().toString().trim();
                if(ag.length() != 0){
                    playerList.add(ag);
                    txt1.setText(""); // adds text to arraylist and make edittext blank again
                    t1.setText(ag);



                }



            }
        });*/
        Button button1=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);
            }
        });
    }
}
