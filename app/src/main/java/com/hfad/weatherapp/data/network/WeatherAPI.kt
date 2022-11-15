package com.hfad.weatherapp.data.network

import com.hfad.weatherapp.data.model.WeatherModel
import retrofit2.http.GET
import io.reactivex.Single

//https://api.openweathermap.org/data/2.5/weather?q=Krasnodar&appid=3ab41cf417cba3a522b492dcc5ebd36c&units=metric

interface WeatherAPI {
    @GET("data/2.5/weather?q=Krasnodar&appid=3ab41cf417cba3a522b492dcc5ebd36c&units=metric")
    fun getData(): Single<WeatherModel>
}