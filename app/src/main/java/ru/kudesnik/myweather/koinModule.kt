package ru.kudesnik.myweather

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.kudesnik.myweather.ui.main.MainViewModel

val appModule = module {

    //View models
    viewModel { MainViewModel() }
}