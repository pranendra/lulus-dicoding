package com.evanfauzi.submissiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class DetailProsesor extends AppCompatActivity {
    Toolbar back;
    ImageView imageprosesor;
    TextView nameProsesor, detailProsesor, spekProsesor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_prosesor);

        imageprosesor = findViewById(R.id.img_item_photo);
        nameProsesor = findViewById(R.id.tv_item_name);
        detailProsesor = findViewById(R.id.tv_item_detail);
        spekProsesor = findViewById(R.id.tv_item_spesifikasi);

        back = findViewById(R.id.toolbarback);
        setSupportActionBar(back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        int photo = getIntent().getIntExtra("ProsesorImages", 0);
        String nama = getIntent().getStringExtra("ProsesorNames");
        String deskripsi = getIntent().getStringExtra("ProsesorDetails");
        String spek = getIntent().getStringExtra("ProsesorSpek");
        imageprosesor.setImageResource(photo);
        nameProsesor.setText(nama);
        detailProsesor.setText(deskripsi);
        spekProsesor.setText(spek);
    }

    private void setSupportActionBar(Toolbar back) {
    }
}
