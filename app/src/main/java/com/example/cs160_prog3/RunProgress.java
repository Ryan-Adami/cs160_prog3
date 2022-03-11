package com.example.cs160_prog3;

        import androidx.fragment.app.FragmentActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.example.cs160_prog3.databinding.ActivityRunProgressBinding;
        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;
        import com.example.cs160_prog3.databinding.ActivityRunProgressBinding;


public class RunProgress extends FragmentActivity implements OnMapReadyCallback {
    private ActivityRunProgressBinding binding;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityRunProgressBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng berkeley = new LatLng(37.867, -122.26);
        mMap.moveCamera( CameraUpdateFactory.newLatLngZoom(berkeley , 17) );
        mMap.addMarker(new MarkerOptions().position(berkeley).title("Finish Point"));
    }
    public void goBackToMain(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void resume(View view) {
        Button button = findViewById(R.id.button);
        if(button.getText().toString().equals("Resume")){
            button.setText("Pause");
        } else {
            button.setText("Resume");
        }

    }

}