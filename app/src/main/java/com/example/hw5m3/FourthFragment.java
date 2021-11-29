package com.example.hw5m3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw5m3.databinding.FragmentFourthBinding;

public class FourthFragment extends Fragment {
    private FragmentFourthBinding binding;

    public static final String PUT_KEY = "fourth_text.key";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFourthBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            String value = getArguments().getString(ThirdFragment.PUT_KEY);
            binding.tvText.setText(value);
        }

        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString(PUT_KEY, binding.tvText.getText().toString());
                FifthFragment fifthFragment = new FifthFragment();
                fifthFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fifthFragment).commit();
            }
        });
    }
}