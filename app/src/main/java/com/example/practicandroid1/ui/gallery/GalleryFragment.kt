package com.example.practicandroid1.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.practicandroid1.R
import com.example.practicandroid1.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {



    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.

    private val binding get() = _binding!!

    override fun onCreateView(



        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?




    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)

        val root: View = binding.root




        val textView: TextView = binding.textGallery
        galleryViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it





        }

        return root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null




    }

}