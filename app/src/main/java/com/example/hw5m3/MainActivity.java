package com.example.hw5m3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.hw5m3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        initViews();
        binding.flContainer2.setVisibility(View.VISIBLE);
    }

    private void initViews() {
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container, new MainFragment()).commit();
    }

    public void onSendClick(View view) {
        Toast.makeText(this, "fdfadsf", Toast.LENGTH_SHORT).show();
    }
}