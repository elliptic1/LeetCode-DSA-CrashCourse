fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val a = "5ygh45hyg456rtju645uyh65yu"
    println(a.reversed())
    println(reverse(a))
    println(a.reversed() == reverse(a))
}

fun reverse(input: String): String {
    var input_ca = input.toCharArray()
    var a = 0
    var b = input_ca.size - 1
    var t: Char
    while (a < b) {
        t = input_ca[a]
        input_ca[a] = input_ca[b]
        input_ca[b] = t
        a++
        b--
    }
    return String(input_ca)
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

