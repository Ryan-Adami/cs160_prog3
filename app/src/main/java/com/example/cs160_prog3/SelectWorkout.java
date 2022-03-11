package com.example.cs160_prog3;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.cs160_prog3.databinding.ActivityProfileBinding;

public class SelectWorkout extends AppCompatActivity {
    private ActivityProfileBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choices);
    }
}
