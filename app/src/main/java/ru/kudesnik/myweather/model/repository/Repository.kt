package ru.kudesnik.myweather.model.repository

import ru.kudesnik.myweather.model.entities.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage(): Weather
}