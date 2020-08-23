package com.dav.model

import com.google.gson.annotations.SerializedName

class CoinResponse {
    @SerializedName("status")
    lateinit var status: String
    @SerializedName("data")
    lateinit var coinData: CoinDataResponse
}

class CoinDataResponse {
    @SerializedName("coins")
    var listCoin = ArrayList<CoinDataListResponse?>()

}

class CoinDataListResponse {
    @SerializedName("name")
    var name: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("iconUrl")
    var iconUrl: String? = null
}