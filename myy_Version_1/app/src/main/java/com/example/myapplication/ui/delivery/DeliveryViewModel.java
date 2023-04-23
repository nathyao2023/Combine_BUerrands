package com.example.myapplication.ui.delivery;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class DeliveryViewModel extends ViewModel {

    private MutableLiveData<String> text;

    private MutableLiveData<List<DeliveryFragment.Order>> orders = new MutableLiveData<>();

    public DeliveryViewModel() {
        text = new MutableLiveData<>();
        text.setValue("This is delivery fragment");
    }

    public LiveData<String> getText() {
        return text;
    }

    public void setOrders(List<DeliveryFragment.Order> orders) {
        this.orders.setValue(orders);
    }

    public LiveData<List<DeliveryFragment.Order>> getOrders() {
        return orders;
    }
}

//public class DeliveryViewModel extends ViewModel {
//
//    private MutableLiveData<List<Order>> orders = new MutableLiveData<>();
//
//
//    public void setOrders(List<Order> orders) {
//        this.orders.setValue(orders);
//    }
//
//    public LiveData<List<Order>> getOrders() {
//        return orders;
//    }
//}
