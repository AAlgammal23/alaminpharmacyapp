package com.alamin.pharma.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Alarm
import androidx.compose.material.icons.filled.GridView
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.UploadFile
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.alamin.pharma.R
import com.alamin.pharma.ui.screens.AccountScreen
import com.alamin.pharma.ui.screens.CategoriesScreen
import com.alamin.pharma.ui.screens.HomeScreen
import com.alamin.pharma.ui.screens.PrescriptionScreen
import com.alamin.pharma.ui.screens.ReminderScreen

sealed class Tab(val icon: ImageVector, val labelRes: Int) {
    data object Home : Tab(Icons.Filled.Home, R.string.tab_home)
    data object Categories : Tab(Icons.Filled.GridView, R.string.tab_drugs)
    data object Prescription : Tab(Icons.Filled.UploadFile, R.string.tab_prescription)
    data object Reminder : Tab(Icons.Filled.Alarm, R.string.tab_reminder)
    data object Account : Tab(Icons.Filled.AccountCircle, R.string.tab_account)
}

val Tabs = listOf(Tab.Home, Tab.Categories, Tab.Prescription, Tab.Reminder, Tab.Account)

@Composable
fun AlAminAppRoot() {
    var current by remember { mutableStateOf<Tab>(Tab.Home) }

    Scaffold(
        bottomBar = {
            NavigationBar(containerColor = MaterialTheme.colorScheme.surface) {
                Tabs.forEach { tab ->
                    NavigationBarItem(
                        selected = current == tab,
                        onClick = { current = tab },
                        icon = { Icon(tab.icon, contentDescription = null) },
                        label = { Text(stringResource(tab.labelRes)) },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = MaterialTheme.colorScheme.onPrimary,
                            selectedTextColor = MaterialTheme.colorScheme.primary,
                            indicatorColor = MaterialTheme.colorScheme.primary,
                            unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                            unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    )
                }
            }
        }
    ) { padding ->
        ScreenContainer(padding, current)
    }
}

@Composable
private fun ScreenContainer(padding: PaddingValues, tab: Tab) {
    when (tab) {
        Tab.Home -> HomeScreen(modifier = Modifier.padding(padding))
        Tab.Categories -> CategoriesScreen(modifier = Modifier.padding(padding))
        Tab.Prescription -> PrescriptionScreen(modifier = Modifier.padding(padding))
        Tab.Reminder -> ReminderScreen(modifier = Modifier.padding(padding))
        Tab.Account -> AccountScreen(modifier = Modifier.padding(padding))
    }
}
