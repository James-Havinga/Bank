package main.kotlin

class Bank() {
    var moneyInBank = 0.00

    fun deposit(amount: Double){
        moneyInBank += amount
    }

    fun withdraw(amount: Double){
        moneyInBank -= amount
    }


}