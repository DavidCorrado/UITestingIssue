package com.example.uitestingissue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.navigation.findNavController
import com.example.uitestingissue.ui.theme.UITestingIssueTheme

class MainFragment : Fragment() {

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
                            Text(text = "Hello, World!")
                            Button(onClick = {
                                findNavController().navigate(R.id.action_mainFragment_to_secondFragment)
                            }) {
                                Text(text = "Go to Second Fragment")
                            }
                        }
                    }
                }
            }
        }
    }
}