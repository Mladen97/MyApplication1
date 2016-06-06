package com.gosho.android.myapplicationhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView inputYN;
    EditText name;
    Button btnLogIn;
    EditText txtInf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input);
        inputYN= (TextView) findViewById(R.id.editTxt_name);
        name= (EditText) findViewById(R.id.textView);
        btnLogIn= (Button) findViewById(R.id.btn_logIn);
        txtInf= (EditText) findViewById(R.id.txt_information);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent= new Intent(LoginActivity.this,DetailsActivity.class);
                intent.putExtra("name", name.getText().toString());
                startActivity(intent);
            }
        });

    }
}
