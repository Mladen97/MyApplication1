package com.gosho.android.myapplicationhomework;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.net.Uri.parse;


public class SummaryActivity extends AppCompatActivity {
    Button btnShowAdrs;
    TextView txtInf;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary);
        btnShowAdrs= (Button) findViewById(R.id.btn_showAdrs);
        txtInf= (TextView) findViewById(R.id.txt_information);
        String textInf = getIntent().getStringExtra("years") + " " + getIntent().getStringExtra("address") + " " + getIntent().getStringExtra("town") + " " + getIntent().getStringExtra("birthday");
        txtInf.setText(textInf);
       btnShowAdrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (Intent.ACTION_VIEW, parse(https://www.google.bg/maps?source=tldso);
                startActivity(i);

            }
        });
    }
}
