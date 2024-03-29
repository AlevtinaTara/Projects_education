fun main() {
    var inputLevels: Int? = null
    val phrase1 = "I hate "
    val phrase2 = "I love "
    val phrase3 = "it"
    val phrase4 = "that "
    var feelingsBanner = phrase1

    while (inputLevels == null || (inputLevels < 1 || inputLevels > 100)) {
        println("Введите колличество уровней погружения")
        inputLevels = try {
            readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            println("Введенные символы не являются числом или введенное число меньше 1 или больше 100.")
            null
        }
    }
    if (inputLevels != 1) {
        for (item in 2..inputLevels) {
            if (item % 2 == 0) {
                feelingsBanner = feelingsBanner + phrase4 + phrase2
            } else {
                feelingsBanner = feelingsBanner + phrase4 + phrase1
            }
        }
    }
    println(feelingsBanner + phrase3)
}