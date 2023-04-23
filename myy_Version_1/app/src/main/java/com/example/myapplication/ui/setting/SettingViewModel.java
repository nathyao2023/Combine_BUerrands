package com.example.myapplication.ui.setting;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class SettingViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SettingViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Setting fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}