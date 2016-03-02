package com.nadavrozen.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
import android.widget.*;
import android.view.View.OnClickListener;
import java.lang.Math;
import android.app.AlertDialog;
import android.content.DialogInterface;


public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btn;
   // Button btnCancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.textView2);
        btn = (Button) findViewById(R.id.button);
       // btnCancel = (Button) findViewById(R.id.btnCancel);

        // create click listener
        OnClickListener oclBtnOk = new OnClickListener() {

            @Override
            public void onClick(View v) {
                EditText billStr = (EditText)findViewById(R.id.editText1);
                String st = billStr.getText().toString();
                if (!st.isEmpty()){
                    CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox1);
                    //EditText billStr = (EditText)findViewById(R.id.editText1);
                    double billNumbered = Double.parseDouble(st);
                    if(checkBox.isChecked()){
                        //tvOut.setText("checkbox is checked");
                        int a = 1;
                        int rounded = (int) Math.ceil((billNumbered*12)/100);
                        tvOut.setText(rounded+"$");


                    }
                    else{
                        double notRounded = (billNumbered*12)/100;
                        tvOut.setText(notRounded+"$");
                    }


                }
                // change text of the TextView (tvOut)



            }
        };
        btn.setOnClickListener(oclBtnOk);

    }



}
