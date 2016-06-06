package com.gosho.android.myapplicationhomework;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetailsActivity extends AppCompatActivity {
    EditText years;
    EditText address;
    EditText town;
    EditText birthday;
    Button btnNext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        years = (EditText) findViewById(R.id.editText_years);
        address = (EditText) findViewById(R.id.editText_address);
        town = (EditText) findViewById(R.id.editText_town);
        birthday = (EditText) findViewById(R.id.editText_birthday);
        btnNext = (Button) findViewById(R.id.btn_next);
        String text = getIntent().getStringExtra("name");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, SummaryActivity.class);
                intent.putExtra("years", years.getText().toString());
                intent.putExtra("address", address.getText().toString());
                intent.putExtra("town", town.getText().toString());
                intent.putExtra("birtday", birthday.getText().toString());
                startActivity(intent);
            }
        });

    }
}



