package id.putraprima.mvvmlogin.viewModel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import id.putraprima.mvvmlogin.model.User;

public class LoginFragmentViewModelFactory implements ViewModelProvider.Factory {

    private User user;

    public LoginFragmentViewModelFactory() {
    }

    public LoginFragmentViewModelFactory(User user) {
        this.user = user;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(LoginFragmentViewModel.class)){
            return (T) new LoginFragmentViewModel();
        }
        throw new IllegalArgumentException("viewmodel yang diminta LoginFragmentViewModel");
    }
}
