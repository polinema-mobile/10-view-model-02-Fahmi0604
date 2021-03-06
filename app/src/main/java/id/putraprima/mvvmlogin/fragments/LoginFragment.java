package id.putraprima.mvvmlogin.fragments;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.putraprima.mvvmlogin.R;
import id.putraprima.mvvmlogin.databinding.FragmentLoginBinding;
import id.putraprima.mvvmlogin.model.User;
import id.putraprima.mvvmlogin.viewModel.LoginFragmentViewModel;
import id.putraprima.mvvmlogin.viewModel.LoginFragmentViewModelFactory;

public class LoginFragment extends Fragment {

    private LoginFragmentViewModel loginFragmentViewModel;
    private User user;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentLoginBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);
//        LoginFragmentViewModelFactory loginFragmentViewModelFactory = new LoginFragmentViewModelFactory();
        loginFragmentViewModel = new ViewModelProvider(this).get(LoginFragmentViewModel.class);
        binding.setLifecycleOwner(this);
        binding.setViewModel(loginFragmentViewModel);
        binding.setUser(user);
//        binding.setUser(user);
//        binding.getViewModel().getCek().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                if (s.equalsIgnoreCase("Berhasil")){
//                    Navigation.findNavController(getView()).navigate(R.id.action_loginFragment_to_homeFragment);
//                } else {
//                    binding.editTextEmail.setError("Username atau Password Salah");
//                }
//            }
//        });

        return binding.getRoot();
    }
}