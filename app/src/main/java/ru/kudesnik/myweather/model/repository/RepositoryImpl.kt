package ru.kudesnik.myweather.model.repository

import ru.kudesnik.myweather.model.entities.Weather
import ru.kudesnik.myweather.model.entities.getRussianCities
import ru.kudesnik.myweather.model.entities.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorageRus()= getRussianCities()
    override fun getWeatherFromLocalStorageWorld()= getWorldCities()
}