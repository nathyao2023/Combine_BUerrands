package com.example.myapplication.ui.shopping_cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentShoppingCartBinding;

public class ShoppingCartFragment extends Fragment {

    private FragmentShoppingCartBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ShoppingCartViewModel shoppingCartViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(ShoppingCartViewModel.class);

        binding = FragmentShoppingCartBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textShoppingCart;
        shoppingCartViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}