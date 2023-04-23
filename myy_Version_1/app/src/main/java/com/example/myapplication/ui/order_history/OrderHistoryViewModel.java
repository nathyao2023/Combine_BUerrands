package com.example.myapplication.ui.order_history;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class OrderHistoryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public OrderHistoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Order History fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}