package com.example.hw5m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hw5m3.databinding.FragmentMainBinding;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;

    public static final String PUT_KEY = "text_sender.key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false);
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Reached!",Toast.LENGTH_SHORT).show();
                if (!binding.edTitle.getText().toString().isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putString(PUT_KEY, binding.edTitle.getText().toString());
                    SecondFragment secondFragment = new SecondFragment();
                    secondFragment.setArguments(bundle);

                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fl_container_2, secondFragment).commit();

                }
            }
        });
    }
}