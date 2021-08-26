package com.sundar.parcable_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoNextActivity(View view){

        User user = new User("Ankita", 20);
        Parcelable parcelable = Parcels.wrap(user);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("DATA_KEy", parcelable);
        startActivity(intent);
    }
}