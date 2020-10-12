package idv.hsu.keeprunning.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import idv.hsu.keeprunning.R
import idv.hsu.keeprunning.ui.viewmodels.StatisticsViewModel

@AndroidEntryPoint
class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}