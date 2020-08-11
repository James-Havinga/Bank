package main.kotlin

val WITHDRAW = 1
val DEPOSIT = 2
val EXIT = 3
var usersChoice: Int = WITHDRAW

fun main(args: Array<String>){
    println("What's your name?")
    val name = readLine()
    println("Welcome to $name's bank!")
    val bank: Bank = Bank()
    doBankActionFromUserInput(bank)

}

fun doBankActionFromUserInput(bank: Bank){
    while (usersChoice != EXIT){
        greetUserWithChoices()
        displayAmountInBank(bank)
        usersChoice = readLine()!!.toInt()
        if(usersChoice == DEPOSIT){
            val depositAmount = getDepositAmountFromUser()
            bank.deposit(depositAmount)
        } else if (usersChoice == WITHDRAW){
            val withdrawAmount = getWithdrawAmountFromUser()
            bank.withdraw(withdrawAmount)
        }
    }
}

fun greetUserWithChoices(){
    println("Choose what you would like to do. ")
    println("1: Withdraw")
    println("2: Deposit")
    println("3: Exit")
}

fun displayAmountInBank(bank: Bank) {
    println("Current amount of money: ${bank.moneyInBank}")
}

fun getDepositAmountFromUser(): Double{
    print("How much would you like to deposit? ")
    val depositAmount = readLine()!!.toDouble()
    return depositAmount
}

fun getWithdrawAmountFromUser(): Double{
    print("How much would you like to withdraw? ")
    val withdrawAmount = readLine()!!.toDouble()
    return withdrawAmount
}