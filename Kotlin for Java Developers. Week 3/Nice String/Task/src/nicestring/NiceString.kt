package nicestring

fun String.isNice(): Boolean {
    var isNice = false
    var isOk = false
    val vowels = listOf('a','e','i','o','u')

    val isNotNiceString = !this.contains("bu") && !this.contains("ba") && !this.contains("be")
    val constainsThreeVowels = this.filter{it -> vowels.contains(it)}.count() >= 3

    this.forEachIndexed { index, c ->
        if(index != 0){
            if(this.get(index - 1) == c){
                isNice = true
            }
        }
    }
    isOk = listOf(isNotNiceString, constainsThreeVowels, isNice)
            .filter { it }
            .count() >= 2

    return isOk

}