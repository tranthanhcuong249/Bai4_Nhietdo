package com.example.thanh.bai4_nhietdo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtf, edtc;
    Button btncf,btnfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtf = (EditText) findViewById(R.id.edtf);
        edtc = (EditText) findViewById(R.id.edtc);
        btnfc = (Button) findViewById(R.id.btnfc);
        btncf = (Button) findViewById(R.id.btncf);
        //btndel = (Button) findViewById(R.id.btndel);
        btncf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String doc = edtc.getText()+"";
                int c = Integer.parseInt(doc);
                edtf.setText(""+dcf.format(c*1.8+32));


            }
        });
        btnfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat dcf = new DecimalFormat("#.00");
                String dof = edtf.getText()+"";
                int f = Integer.parseInt(dof);
                edtc.setText(""+dcf.format((f-32)/1.8));
            }
        });
     }
}
