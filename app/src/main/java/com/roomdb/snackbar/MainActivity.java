package com.roomdb.snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    CoordinatorLayout coordinatorLayout;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout=findViewById(R.id.coordinatorlayout);
        button=findViewById(R.id.snackbarbtn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackbar=Snackbar.make(coordinatorLayout,"Snackbar display",Snackbar.LENGTH_INDEFINITE);
                snackbar.setAction("Undo", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbarundo=Snackbar.make(coordinatorLayout,"Undo Successful",Snackbar.LENGTH_SHORT);
                    }
                }).setActionTextColor(Color.GREEN);

                snackbar.show();
            }
        });

    }
}