package ru.kudesnik.myweather.model.repository

import ru.kudesnik.myweather.model.entities.Weather

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorage() = Weather()
}