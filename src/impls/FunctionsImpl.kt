package impls

import interfaces.Functions

/**
 * Класс, реализующий интерфейс Functions
 */
class FunctionsImpl : Functions {
    override fun calculate(a: Int, b: Int) = a + b

    override fun substringCounter(s: String, sub: String): Int {
        TODO("Not yet implemented")
    }

    override fun splitterSorter(s: String, sub: String): List<String> {
        TODO("Not yet implemented")
    }

    override fun uniqueCounter(s: String, sub: String): Map<String, Int> {
        TODO("Not yet implemented")
    }

    override fun isPalindrome(s: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun invert(s: String): String {
        TODO("Not yet implemented")
    }
}
