fun main() {
    println("=== Практичне завдання ===\n")
    
    // Завдання 1: Порівняння двох чисел
    println("Завдання 1: Порівняння двох чисел")
    val num1 = 15
    val num2 = 10
    println("Число 1: $num1")
    println("Число 2: $num2")
    when {
        num1 > num2 -> println("$num1 більше ніж $num2")
        num1 < num2 -> println("$num1 менше ніж $num2")
        else -> println("$num1 дорівнює $num2")
    }
    println()
    
    // Завдання 2: Цілочисельне ділення через віднімання
    println("Завдання 2: Цілочисельне ділення через віднімання")
    val dividend = 20
    val divisor = 3
    var quotient = 0
    var remainder = dividend
    while (remainder >= divisor) {
        remainder -= divisor
        quotient++
    }
    println("$dividend / $divisor = $quotient (залишок: $remainder)")
    println()
    
    // Завдання 3: Множення через додавання
    println("Завдання 3: Множення через додавання")
    val multiplier1 = 7
    val multiplier2 = 6
    var product = 0
    for (i in 1..multiplier2) {
        product += multiplier1
    }
    println("$multiplier1 * $multiplier2 = $product")
    println()
    
    // Завдання 4: Обчислення суми ряду
    println("Завдання 4: Обчислення суми ряду")
    println("Сума ряду: 1 + 1/2 + 1/3 + ... + 1/n")
    val n = 10
    var sum = 0.0
    for (i in 1..n) {
        sum += 1.0 / i
        println("Ітерація $i: сума = $sum")
    }
    println()
}