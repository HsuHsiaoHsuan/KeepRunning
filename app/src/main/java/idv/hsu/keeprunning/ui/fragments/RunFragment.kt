package idv.hsu.keeprunning.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import idv.hsu.keeprunning.R
import idv.hsu.keeprunning.ui.viewmodels.MainViewModel

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}