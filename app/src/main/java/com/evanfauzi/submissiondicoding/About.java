package com.evanfauzi.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class About extends AppCompatActivity {
    Toolbar back;
    ImageView image;
    TextView name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);


        image = findViewById(R.id.image);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    private void setSupportActionBar(Toolbar back) {
    }
}
