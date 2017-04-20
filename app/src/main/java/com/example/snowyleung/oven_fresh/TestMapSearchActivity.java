package com.example.snowyleung.oven_fresh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.snowyleung.oven_fresh.BakerySearch.MyMarker;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Marker;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMapSearchActivity extends AppCompatActivity  implements OnMapReadyCallback {

    private GoogleMap mMap;
    private HashMap<Marker, MyMarker> mMarkersHashMap;
    private ArrayList<MyMarker> mMyMarkersArray = new ArrayList<MyMarker>();

    private static final int REQUEST_FINE_LOCATION_PERMISSION = 102;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_map_search);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map2);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
    public void place1(View view) {
        Uri gmmIntentUri = Uri.parse("geo:22.3371329,114.1706073");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }

    public void place2(View view) {

        //Uri gmmIntentUri = Uri.parse("geo:22.326493,114.2056847");
        String url = "https://www.google.com.hk/maps/place/%E9%A6%99%E6%B8%AF%E5%9F%8E%E5%B8%82%E5%A4%A7%E5%AD%B8%E5%AD%B8%E8%A1%93%E6%A8%93+(%E4%B8%89)/@22.3378299,114.1704813,17z/data=!3m1!4b1!4m5!3m4!1s0x3404073400f3ef35:0xdfa4f400c9daedb8!8m2!3d22.337825!4d114.17267";
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);

    }
}
