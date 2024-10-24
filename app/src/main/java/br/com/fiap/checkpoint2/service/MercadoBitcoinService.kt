package br.com.fiap.checkpoint2.service

import br.com.fiap.checkpoint2.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET
interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}