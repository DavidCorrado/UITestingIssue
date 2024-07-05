package com.example.uitestingissue

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule
    @JvmField
    val composeTestRule = createAndroidComposeRule(MainActivity::class.java)

    @Test
    fun appLaunches() {
        composeTestRule.apply {
            onNodeWithText("Go to Second Fragment")
                .performClick()
            onNodeWithText("SecondFragment").assertIsDisplayed()

        }
    }
}