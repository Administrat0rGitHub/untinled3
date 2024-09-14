fun main() {
    print("Введите натуральное целое число: ")
    val input = readlnOrNull()
    if (input != null && input.all { it.isDigit() } && input.toInt() > 0) {

        val number = input.toInt()


        val binStr = number.toString(2)

        // Вывод результата
        println("Двоичное представление вашего числа $number: $binStr")
    } else {
        println("Ошибка!: Введите корректное натуральное целое число.")
    }
}



