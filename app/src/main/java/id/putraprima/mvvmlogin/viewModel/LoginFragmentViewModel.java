package id.putraprima.mvvmlogin.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import id.putraprima.mvvmlogin.model.User;

public class LoginFragmentViewModel extends ViewModel {

    public MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();
    public User user;


    public LoginFragmentViewModel() {
        this.userMutableLiveData.setValue(user);
    }

    public String verifLogin() {
     String cek="";
        if (cek.equalsIgnoreCase("admin") && user.getPassword().equalsIgnoreCase("admin")){
            cek = "berhasil";
        } else {
            cek = "gagal";
        }
     return cek;
    }

//    public MutableLiveData<User> LiveDataUser() {
//        return userMutableLiveData;
//    }

    public void cek(){
        userMutableLiveData.setValue(user);
        Log.d("username",userMutableLiveData.getValue().getUsername().toString());
        Log.d("username",userMutableLiveData.getValue().getPassword().toString());
    }
}
