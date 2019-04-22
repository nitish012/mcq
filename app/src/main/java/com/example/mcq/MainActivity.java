package com.example.mcq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    RadioButton button1,button2,button3;
    RadioGroup radioGroup1, radioGroup2, radioGroup3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submit_button);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioGroup1 =  findViewById(R.id.textview1);
                radioGroup2 =  findViewById(R.id.textview2);
                radioGroup3 =  findViewById(R.id.textView3);
                int selectedId1 = radioGroup1.getCheckedRadioButtonId();
                button1 =  findViewById(selectedId1);
                if(selectedId1==-1){
                    Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,button1.getText(), Toast.LENGTH_SHORT).show();
                }
                int selectedId2 =  radioGroup2.getCheckedRadioButtonId();
                 button2=findViewById(selectedId2);
                if(selectedId2==-1){
                    Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,button2.getText(), Toast.LENGTH_SHORT).show();
                }
                int selectedId3 =  radioGroup3.getCheckedRadioButtonId();
                button3 = findViewById(selectedId3);
                if(selectedId3==-1){
                    Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this,button3.getText(), Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(MainActivity.this,Result.class);
                Bundle extras = new Bundle();
                extras.putString("group1",button1.getText().toString());
                extras.putString("group2",button2.getText().toString());
                extras.putString("group3",button3.getText().toString());
                intent.putExtras(extras);
                startActivity(intent);

            }
        });

    }
}
