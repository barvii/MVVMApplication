package com.pcc.mvvmapplication.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.pcc.mvvmapplication.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserViewModel extends ViewModel {

    private List<User> mUserList = new ArrayList<>();

    //TODO: Fetch the data using ApiHelper.
    // Set the response into mUserList and the update the LiveData.
    // Subscribe on the LiveData in the MainActivity.
    private MutableLiveData<List<User>> mUserListLiveData;

}
