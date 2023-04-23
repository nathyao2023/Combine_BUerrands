package com.example.myapplication.ui.shopping_cart;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ShoppingCartViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ShoppingCartViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Shopping Cart fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}