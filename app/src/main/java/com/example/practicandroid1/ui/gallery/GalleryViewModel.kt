package com.example.practicandroid1.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practicandroid1.R

import android.widget.MediaController
import android.widget.VideoView






class GalleryViewModel : ViewModel() {


    //private val _text = MutableLiveData<String>().apply {
      //  value = "Galeria"
        private val _text = MutableLiveData<String>().apply {
            value = "Galeria"



    }
    val text: LiveData<String> = _text



}
