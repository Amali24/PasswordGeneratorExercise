val lettersLower = "abcdefghijklmnoipqrstuvwxyz".toCharArray()
val lettersUpper = "ABCDEFGHIJKLMNOPQRSTUIVWXYZ".toCharArray()
val numbers = "1234567890".toCharArray()
val symbols = " !\"#$%\'()*+,-./:;<=>?@[\\]^_`{|}~".toCharArray()

fun main(args: Array<String>) {

    var exit = false

    while(!exit) {
        generatePassword()

        println("Press enter to generate new password. Type \'x\' to exit")
        exit = (readLine()!! == "x")
    }

}

/*private fun generatePassword() {

    var password = ""

    val passwordLength = (8..25).random()

    for (i in 0..passwordLength) {
        val charType = (1..5).random()
        when (charType) {
            1 -> password += lettersLower[(0..lettersLower.size).random()]
            2 -> password += lettersUpper[(0..lettersUpper.size).random()]
            3 -> password += numbers[(0..numbers.size).random()]
            4 -> password += symbols[(0..symbols.size).random()]
        }
    }
    println(password)
}*/

private fun generatePassword() {

    val password: ArrayList<Char> = arrayListOf()

    var newChar:Char

    var numLow = 0
    var numUpp = 0
    var numDig = 0
    var numSpe = 0

    while (numLow < 2){
        newChar = lettersLower[(0..lettersLower.size).random()]
        password.add((0..password.size).random(), newChar)
        numLow++
    }
    while (numUpp < 2){
        newChar = lettersUpper[(0..lettersUpper.size).random()]
        password.add((0..password.size).random(), newChar)
        numUpp++
    }
    while (numDig < 2){
        newChar = numbers[(0..numbers.size).random()]
        password.add((0..password.size).random(), newChar)
        numDig++
    }
    while (numSpe < 2){
        newChar = symbols[(0..symbols.size).random()]
        password.add((0..password.size).random(), newChar)
        numSpe++
    }

    val passwordLength = (8..25).random() - password.size

    for (i in 0..passwordLength) {


        val charType = (1..5).random()
        when (charType) {
            1 -> {
                newChar = lettersLower[(0..lettersLower.size).random()]
                password.add(newChar)
            }
            2 -> {
                newChar = lettersUpper[(0..lettersUpper.size).random()]
                password.add(newChar)
            }
            3 -> {
                newChar = numbers[(0..numbers.size).random()]
                password.add(newChar)
            }
            4 -> {
                newChar = symbols[(0..symbols.size).random()]
                password.add(newChar)
            }
        }
    }
    for (i in password.indices){
        print(password[i])
    }
    print("\n")
}

// Random function via user s1m0nw1 on stackoverflow.com (https://stackoverflow.com/a/49507413)
private fun ClosedRange<Int>.random() = (Math.random() * (endInclusive - start) + start).toInt()

