package com.example.translateapp


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.translateapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var isClickAIButton = false
    private var initialCardViewHeight = 200

    private val binding by lazy {
        FragmentMainBinding.inflate(layoutInflater)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        binding.AIButton.setOnClickListener {
            isClickAIButton = true
         Common.changeCardViewHeight(requireContext(),binding.cardView,100)
         Common.changeCardViewHeight(requireContext(),binding.materialCardView,120)
            binding.AIView.visibility = View.VISIBLE
        }

        binding.mainFragment.setOnClickListener {
            if (isClickAIButton) {
                isClickAIButton = false
                Common.changeCardViewHeight(requireContext(),binding.cardView,initialCardViewHeight)
                Common.changeCardViewHeight(requireContext(),binding.materialCardView,initialCardViewHeight)
                binding.AIView.visibility = View.GONE
            }

        }
    }


}