package com.sundar.parcable_data;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Parcelable parcelable = getIntent().getParcelableExtra("DATA_KEY");
        User user = Parcels.unwrap(parcelable);
        Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();

    }
}