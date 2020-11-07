package id.putraprima.mvvmlogin.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import id.putraprima.mvvmlogin.BR;

public class User {
    private String username;
    private String Password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        Password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
