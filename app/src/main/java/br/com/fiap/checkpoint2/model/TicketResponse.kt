package br.com.fiap.checkpoint2.model

class TickerResponse(
    val ticker: Ticker
)
class Ticker(
    val high: String,
    val low: String,
    val vol: String,
    val last: String,
    val buy: String,
    val sell: String,
    val date: Long
)
