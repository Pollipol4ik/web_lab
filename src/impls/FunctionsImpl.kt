package impls

import interfaces.Functions

/**
 * Класс, реализующий интерфейс Functions
 */
class FunctionsImpl : Functions {
    override fun calculate(a: Int, b: Int) = a + b

    override fun substringCounter(s: String, sub: String): Int {
        return s.split(sub).count() - 1;
    }

    override fun splitterSorter(s: String, sub: String): List<String> {
        return s.split(sub)
    }

    override fun uniqueCounter(s: String, sub: String): Map<String, Int> {
        val list = s.split(sub)
        val map = mutableMapOf<String, Int>()
        for (i in list) {
            map[i] = map.getOrDefault(i, 0) + 1
        }
        return map
    }

    override fun isPalindrome(s: String): Boolean {
        if (s.isEmpty()) return false
        return s==s.reversed()
    }

    override fun invert(s: String): String {
        return s.reversed()
    }
}
