package com.example.daftarhargalaptop;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_JENIS = "extra_jenis";
    public static final String EXTRA_MERK = "extra_merk";
    public static final String EXTRA_HARGA = "extra_harga";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_PHOTO= "extra_photo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvJenis = findViewById(R.id.jenis);
        TextView tvMerk = findViewById(R.id.merk);
        TextView tvHarga = findViewById(R.id.harga);
        TextView tvDeskripsi= findViewById(R.id.deskripsi);
        ImageView detailImageView= findViewById(R.id.img_detail_photo);

        String jenis = getIntent().getStringExtra(EXTRA_JENIS);
        String merk = getIntent().getStringExtra(EXTRA_MERK);
        String harga = getIntent().getStringExtra(EXTRA_HARGA);
        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);

        tvJenis.setText(jenis);
        tvMerk.setText(merk);
        tvHarga.setText(harga);
        tvDeskripsi.setText(deskripsi);
        Glide.with(this).load(photo).into(detailImageView);
    }
}
