package com.criarsolutions.androidcustomspinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.criarsolutions.androidcustomspinner.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    boolean isVisible = false;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.cl1.setOnClickListener(menuListener);
        activityMainBinding.cl2.setOnClickListener(menuListener);
        activityMainBinding.cl3.setOnClickListener(menuListener);
        activityMainBinding.cl4.setOnClickListener(menuListener);
        activityMainBinding.cl5.setOnClickListener(menuListener);
    }

    public void onSlideViewButtonClick(View view) {
        if (isVisible == false) {
            activityMainBinding.cv.setVisibility(View.VISIBLE);
        } else {
            activityMainBinding.cv.setVisibility(View.INVISIBLE);
        }
        isVisible = !isVisible;
    }

    void displaySchedule(int id) {
        if (id == R.id.cl1) {
            activityMainBinding.cv.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            Toast.makeText(this, "Item 1 Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cl2) {
            activityMainBinding.cv.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            Toast.makeText(this, "Item 2 Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cl3) {
            activityMainBinding.cv.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            Toast.makeText(this, "Item 3 Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cl4) {
            activityMainBinding.cv.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            Toast.makeText(this, "Item 4 Clicked", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.cl5) {
            activityMainBinding.cv.setVisibility(View.INVISIBLE);
            isVisible = !isVisible;
            Toast.makeText(this, "Item 5 Clicked", Toast.LENGTH_SHORT).show();
        }
    }

    private View.OnClickListener menuListener = new View.OnClickListener() {
        public void onClick(View v) {
            displaySchedule(v.getId());
        }
    };
}
