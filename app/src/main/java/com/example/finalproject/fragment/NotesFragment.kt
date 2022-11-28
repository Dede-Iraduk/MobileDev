package com.example.finalproject.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class NotesFragment : Fragment() {
    private var _binding: NotesFragment? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonSend.setOnClickListener {
//            findNavController().navigate(R.id.action_notesFragment_to_notificationsFragment)
//        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}






