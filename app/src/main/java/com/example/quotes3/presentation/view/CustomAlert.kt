package com.example.quotes3.presentation.view

import android.app.Dialog
import android.view.Window
import androidx.fragment.app.Fragment
import com.example.quotes3.databinding.DialogLayoutBinding

class CustomAlert {
    lateinit var binding: DialogLayoutBinding
    fun showDialog(fragment:  Fragment?, msg: String?) {
        binding =  DialogLayoutBinding.inflate(fragment!!.layoutInflater)
        val dialog = fragment.context?.let { Dialog(it) }
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(binding.root)
        binding.message.text= msg
        binding.btnOK.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }
}

