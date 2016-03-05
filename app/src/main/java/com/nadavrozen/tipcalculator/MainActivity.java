package com.nadavrozen.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.CheckBox;
//import android.widget.*;
import android.view.View.OnClickListener;
import java.lang.Math;



public class MainActivity extends AppCompatActivity {
    TextView tvOut;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.txtTipResult);
        btn = (Button) findViewById(R.id.btnCalculate);


        // create click listener
        OnClickListener oclBtnOk = new OnClickListener() {

            @Override
            public void onClick(View v) {
                tvOut.setText("");
                EditText billStr = (EditText)findViewById(R.id.edtBillAmount);
                String st = billStr.getText().toString();
                if (!st.isEmpty()){
                    CheckBox checkBox = (CheckBox)findViewById(R.id.chkRound);
                    //EditText billStr = (EditText)findViewById(R.id.editText1);
                    double billNumbered = Double.parseDouble(st);
                    if(checkBox.isChecked()){
                        //tvOut.setText("checkbox is checked");

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
