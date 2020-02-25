package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean getnumbers(){
        e1=(EditText)findViewById(R.id.NUM1);
        e2 = (EditText)findViewById(R.id.NUM2);
        t1 = (TextView)findViewById(R.id.RESULT);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if((s1.equals(null)&&s2.equals(null))||(s1.equals("")&&s2.equals(""))){
            String result = "please enter a value";
            t1.setText(result);
            return false;
        }
        else{
            num1 = Double.parseDouble(e1.getText().toString());
            num2 = Double.parseDouble(e2.getText().toString());
        }
        return true;
    }
    public void add(View view){
        if(getnumbers()){
            Double result = num1 + num2;
            t1.setText(Double.toString(result));
        }
    }
    public void sub(View view){
        if(getnumbers()){
            Double result = num1 - num2;
            t1.setText(Double.toString(result));
        }
    }
    public void mul(View view){
        if(getnumbers()){
            Double result = num1 * num2;
            t1.setText(Double.toString(result));
        }
    }
    public void div(View view){
        if(getnumbers()){
            Double result = num1 / num2;
            t1.setText(Double.toString(result));
        }
    }
    public void clear(View view){
        e1.setText("");
        e2.setText("");
        t1.setText("");
    }

}
