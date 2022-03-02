package com.example.demofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.demofragment.databinding.OptionFragmentBinding

class OptionFragment : Fragment(R.layout.option_fragment) {

    private var _binding: OptionFragmentBinding? = null
    private val binding get() = _binding!!

    private val option: Int by lazy {
        requireArguments().getInt(ARG_OPTION) ?: 0
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = OptionFragmentBinding.bind(requireView())
        setupViews(view)
    }

    private fun setupViews(view: View) {
        requireActivity().title = getString(R.string.option_title, option)
        binding.lblNumber.text = option.toString()
    }
    companion object {

        private const val ARG_OPTION = "ARG_OPTION"

        fun newArguments(option: Int): Bundle =
            bundleOf(ARG_OPTION to option)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}

