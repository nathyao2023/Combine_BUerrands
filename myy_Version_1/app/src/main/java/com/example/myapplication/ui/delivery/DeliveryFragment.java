package com.example.myapplication.ui.delivery;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.ViewModelProvider;

import com.example.myapplication.databinding.FragmentDeliveryBinding;

import java.util.ArrayList;

public class DeliveryFragment extends Fragment {

    private FragmentDeliveryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        DeliveryViewModel deliveryViewModel =
                new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DeliveryViewModel.class);

        binding = FragmentDeliveryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
//        RecyclerView recyclerView = binding.orderList;
        RecyclerView recyclerView = binding.orderList;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        DeliveryAdapter adapter = new DeliveryAdapter(new ArrayList<>());
        recyclerView.setAdapter(adapter);

        final TextView textView = binding.textDelivery;
        deliveryViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        deliveryViewModel.getOrders().observe(getViewLifecycleOwner(), orders -> {
            adapter.notifyDataSetChanged();
        });

        return root;





    }


//    Order Infromation includes the orderName,start address,end address,
    public class Order {
        private String name;
        private String startAddress;
        private String endAddress;

        public Order(String name, String startAddress, String endAddress) {
            this.name = name;
            this.startAddress = startAddress;
            this.endAddress = endAddress;
        }

        public String getName() {
            return name;
        }

        public String getStartAddress() {
            return startAddress;
        }

        public String getEndAddress() {
            return endAddress;
        }
    }










    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}