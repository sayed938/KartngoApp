package com.exampletafsyr.kartngoapp.ui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;

import com.exampletafsyr.kartngoapp.R;
import com.exampletafsyr.kartngoapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        binding.productRecyclerView.setLayoutManager(gridLayoutManager);
        setClickedButton(binding.btBestOffers, binding.btImported, binding.btFattyCheese, binding.btFattyCheese);
        binding.btImported.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setClickedButton(binding.btImported, binding.btBestOffers, binding.btFattyCheese, binding.btFattyCheese);

            }
        });
        binding.btFattyCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setClickedButton(binding.btFattyCheese, binding.btImported, binding.btCheese, binding.btBestOffers);

            }
        });
        binding.btCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setClickedButton(binding.btCheese, binding.btImported, binding.btFattyCheese, binding.btFattyCheese);
            }
        });
        binding.btBestOffers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setClickedButton(binding.btBestOffers, binding.btImported, binding.btFattyCheese, binding.btCheese);
            }
        });
    }

    @SuppressLint("ResourceAsColor")
    void setClickedButton(Button b1, Button b2, Button b3, Button b4) {
        b1.setCompoundDrawablesWithIntrinsicBounds(R.drawable.baseline_check_24, 0, 0, 0);
        b1.setSelected(true);
        setUnClickedButton(b2);
        setUnClickedButton(b3);
        setUnClickedButton(b4);
    }

    @SuppressLint("ResourceAsColor")
    void setUnClickedButton(Button b) {
        b.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        b.setSelected(false);
    }


}