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

private fun generatePassword() {

    var password = ""

    val passwordLength = (8..24).random()

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
}

// Random function via user s1m0nw1 on stackoverflow.com (https://stackoverflow.com/a/49507413)
private fun ClosedRange<Int>.random() = (Math.random() * (endInclusive - start) + start).toInt()

