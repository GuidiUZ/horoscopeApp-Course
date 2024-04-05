package com.example.horoscapp.ui.providers

import org.junit.Assert.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class RandomCardProviderTest {

    @Test
    fun `get random card should return a random card`() {

        //GIVEN
        val randomCard = RandomCardProvider()

        //WHEN
        val card = randomCard.getLucky()

        //THEN
        Assertions.assertNotNull(card)
    }

}