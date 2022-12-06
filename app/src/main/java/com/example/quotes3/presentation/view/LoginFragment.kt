package com.example.quotes3.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.quotes3.data.model.LoginRequest
import com.example.quotes3.databinding.FragmentLoginBinding
import com.example.quotes3.presentation.viewmodel.DataStoreViewModel
import com.example.quotes3.presentation.viewmodel.LoginViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

@AndroidEntryPoint
class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()
    private val dataStoreViewModel: DataStoreViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root

        observer()
        binding.login.setOnClickListener {
            val account= binding.account.text.toString()
            val password= binding.password.text.toString()
            lifecycleScope.launch {
                loginViewModel.login(LoginRequest(account, password))
            }
        }
        return root
    }

    private fun observer(){
        lifecycleScope.launch {
            loginViewModel.user?.collect{
                if (it.success){
                    val token = it.data
                    val alert = CustomAlert()
                    alert.showDialog(this@LoginFragment,it.message)
                    dataStoreViewModel.let{
                        dataStoreViewModel.saveToken(token)
                    }
                    this.cancel()
                    activity?.onBackPressed()
                } else {
                    if (it.message!="") {
                        val alert = CustomAlert()
                        alert.showDialog(this@LoginFragment,it.message)
                    }
                }
            }
        }

    }

}