package com.example.horoscapp.data.network.response

import com.example.horoscapp.motherobject.HoroscopeMotherObject
import io.kotlintest.shouldBe
import org.junit.Assert.*
import org.junit.Test

class PredictionResponseTest {

    @Test //toDomainShouldReturnACorrectPrediction()
    fun `toDomain should return a correct prediction` () {

        //GIVEN
        val horoscopeResponse = HoroscopeMotherObject.anyResponse

        //WHEN
        val predictionModel = horoscopeResponse.toDomain()

        //THEN
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope

    }
}