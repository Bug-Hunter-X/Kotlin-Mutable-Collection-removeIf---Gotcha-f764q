fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    val newList = list - evenNumbers
    println(newList) //Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    val newMap = map.filterValues { it % 2 != 0 }
    println(newMap) //Output: {a=1, c=3}

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val oddNumbers = set.filter { it % 2 != 0 }
    val newSet = oddNumbers.toMutableSet()
    println(newSet) //Output: [1, 3, 5]

    //Alternatively, to retain the original list, you can create a copy
    val listCopy = list.toMutableList()
    listCopy.removeIf {it % 2 == 0}
    println(listCopy) //Output: [1, 3, 5]
    println(list) //Output: [1, 2, 3, 4, 5]
}