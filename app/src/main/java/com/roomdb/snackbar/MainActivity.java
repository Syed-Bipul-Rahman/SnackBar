package com.roomdb.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout=findViewById(R.id.coordinatorlayout);
        button=findViewById(R.id.snackbarbtn);


    }
}