package com.example.fluxtest.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * テストAPIのデータ
 */

// TODO Serializableの警告アリ
@Serializable
data class TestApiData(

    @SerialName("test_id")
    val testId: Int,

    @SerialName("test_token")
    val testToken: String

)
