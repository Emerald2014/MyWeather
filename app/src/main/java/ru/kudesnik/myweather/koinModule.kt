package ru.kudesnik.myweather

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.kudesnik.myweather.model.repository.Repository
import ru.kudesnik.myweather.model.repository.RepositoryImpl
import ru.kudesnik.myweather.ui.main.MainViewModel

val appModule = module {
    single<Repository> {RepositoryImpl()}

    //View models
    viewModel { MainViewModel(get()) }
}