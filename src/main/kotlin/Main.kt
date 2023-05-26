fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    print(sumExists(listOf(1, 3, 5, 6, 8, 9), 9))
}

fun sumExists(list: List<Int>, sum: Int): List<Int> {
    val sortedList = list.sorted()
    var a = 0
    var b = sortedList.size - 1
    if (sortedList[a] + sortedList[b] == sum) {
        return listOf(sortedList[a], sortedList[b])
    }
    while (a < b) {
        when {
            sortedList[a] + sortedList[b] == sum ->
                return listOf(sortedList[a], sortedList[b])

            sortedList[b] > sum - sortedList[a] -> b--
            sortedList[a] < sum - sortedList[b] -> a++
        }
    }
    return emptyList()
}

fun isPalindrome(input: String): Boolean {
    var a = 0
    var b = input.length - 1
    while (input[a] == input[b]) {
        a++
        b--
        if (a == b || b < a) {
            return true
        }
    }
    return false
}

fun countChars() {
    val s = "123412341241234124123412345123414231"

    val v = s
        .groupBy { it }
        .map {
            print(it.key)
            print(it.value.size)
            println("--")
        }

    print(v)
}

