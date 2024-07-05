package com.example.uitestingissue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import com.example.uitestingissue.ui.theme.UITestingIssueTheme

class SecondFragment : Fragment() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                UITestingIssueTheme {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = { Text(text = "UITestingIssue") }
                            )
                        }
                    ) { paddingValues ->
                        Column(modifier = Modifier.padding(paddingValues)) {
                            Text(text = "SecondFragment")
                        }
                    }
                }
            }
        }
    }
}