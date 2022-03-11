package com.example.cs160_prog3;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.cs160_prog3.databinding.ActivityRunTrackerBinding;


public class RunTracker extends FragmentActivity implements OnMapReadyCallback{
    private ActivityRunTrackerBinding binding;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRunTrackerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng berkeley = new LatLng(37, -122);
        mMap.moveCamera(CameraUpdateFactory.zoomBy(15));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(berkeley));

        mMap.addMarker(new MarkerOptions()
                .position(berkeley)
                .title("Marker in berk"));
    }

}