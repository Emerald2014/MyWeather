package ru.kudesnik.myweather.model.entities

data class Weather(
    val city: City = getDefaultCity(),
    val temperature: Int = 0,
    val feelLike: Int = 0
)

fun getDefaultCity() = City("Москва", 55.755826, 37.6172999)