package com.example.maptrial;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleMap.OnMapLoadedCallback,
        GoogleMap.OnMarkerClickListener{

    //private LatLng[] coordinates = new LatLng[5];
    private ArrayList<LatLng> coordinates = new ArrayList<>();
    private GoogleMap map;
    private GoogleApiClient googleApiClient;
    private Bitmap locationBitmap;

    private Button btn_start_service;
    private Button btn_stop_service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start_service = findViewById(R.id.btn_start_service);
        btn_stop_service = findViewById(R.id.btn_stop_service);

        btn_start_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!needPermission(MainActivity.this)){
                    ActivityCompat.startForegroundService(MainActivity.this, new Intent(MainActivity.this, LocationService.class));
                }
            }
        });

        btn_stop_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(MainActivity.this, LocationService.class));
            }
        });



        SupportMapFragment mapFragment = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(this);

        coordinates.add(new LatLng(21.581312, 39.196426));
        coordinates.add(new LatLng(21.664911, 39.110291));
        coordinates.add(new LatLng(21.540899, 39.196894));
        coordinates.add(new LatLng(21.591035, 39.171869));
        coordinates.add(new LatLng(48.868484, 2.349628));

        if (googleApiClient == null){
            googleApiClient = new GoogleApiClient.Builder(this)
                    .addConnectionCallbacks(this)
                    .addApi(LocationServices.API)
                    .build();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        googleApiClient.connect();
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        setMap();
        MarkerOptions markerOptions = new MarkerOptions();
        //locationBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ic_launcher_background);
        //Log.d("Marker Options", "here");
        for (LatLng latLng: coordinates){
            markerOptions.position(latLng);
            //markerOptions.icon(BitmapDescriptorFactory.fromBitmap(locationBitmap));
            markerOptions.title("Here");
            map.addMarker(markerOptions);
        }
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    private void setMap(){
        map.getUiSettings().setIndoorLevelPickerEnabled(true);
        map.getUiSettings().setAllGesturesEnabled(true);
        map.getUiSettings().setCompassEnabled(true);
        map.setMyLocationEnabled(true);
        map.getUiSettings().setMyLocationButtonEnabled(true);
        map.setOnMapLoadedCallback(this);
        map.getUiSettings().setZoomControlsEnabled(true);
        map.setOnMarkerClickListener(this);
    }

    @Override
    public void onMapLoaded() {

    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }

    public static boolean needPermission(Context context) {
        return context == null || ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED ||
                ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED;
    }
}
