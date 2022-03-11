package com.example.cs160_prog3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.cs160_prog3.databinding.ActivityProfileBinding;
import com.example.cs160_prog3.databinding.ActivityRunTrackerBinding;
import com.google.android.gms.maps.SupportMapFragment;

public class Profile extends AppCompatActivity {
    private ActivityProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}