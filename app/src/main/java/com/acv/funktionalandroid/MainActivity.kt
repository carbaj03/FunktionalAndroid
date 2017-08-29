package com.acv.funktionalandroid


class Cafe {
    fun buyCoffee(cc: CreditCard): Coffee {
        val cup = Coffee(20.0)
        //This is the side effect
        cc.charge(cup.price)
        return cup
    }
}

data class Coffee(val price: Double)

interface CreditCard {
    fun charge(value: Double)
}
