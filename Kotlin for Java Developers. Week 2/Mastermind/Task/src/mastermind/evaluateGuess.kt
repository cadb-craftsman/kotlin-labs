package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    var a = 0
    var b = 0
    var c = 0
    var d = 0
    var e = 0
    var f = 0
    var _a = 0
    var _b = 0
    var _c = 0
    var _d = 0
    var _e = 0
    var _f = 0
    var rightPosition = 0
    var wrongPosition = 0

    println(secret + " " + guess)

    secret.forEach {s ->
        when(s){
            'A' -> a += 1
            'B' -> b += 1
            'C' -> c += 1
            'D' -> d += 1
            'E' -> e += 1
            'F' -> f += 1
        }
    }
    println("A: " + a + " B: " + b + " C: " + c + " D: " + d + " E: " + e + " F: " + f)

    guess.forEach { s ->
        when(s){
            'A' -> _a += 1
            'B' -> _b += 1
            'C' -> _c += 1
            'D' -> _d += 1
            'E' -> _e += 1
            'F' -> _f += 1
        }
    }
    println("A: " + _a + " B: " + _b + " C: " + _c + " D: " + _d + " E: " + _e + " F: " + _f)

    secret.forEachIndexed { i, x ->
        if((i == 0) && (x == 'F')) {
            println("secret starts with F")
            if (rightPosition > 0) {
                rightPosition -= 1
            }
        }
        guess.forEachIndexed { n, s ->
            if (x == s && i == n) {
                rightPosition += 1
            } else {
                if (i == n) {
                    if(((a == 2) && (_a == 2)) || ((b == 2) && (_b == 2)) || ((c == 2) && (_c == 2)) || ((d == 2) && (_d == 2)) || ((e == 2) && (_e == 2)) || ((f == 2) && (_f == 2))){
                        wrongPosition = 2
                    }else if((a == 2) || (b == 2) || (c == 2) || (d == 2) || (e == 2) || (f == 2)){
                        wrongPosition = 0
                    }else{
                        if(((i == secret.length - 1) && (x == 'F'))){
                            println("secret ends with F")
                        } else if(((n == guess.length - 1) && (s == 'F'))){
                            println("guess ends with F")
                            if(wrongPosition > 0) {
                                wrongPosition -= 1
                            }
                        }else {
                            if((i == 0) && (x == 'F')){
                                wrongPosition -= 1
                            }else{
                                wrongPosition += 1
                            }
                        }
                    }
                }
            }
        }
    }
    if(wrongPosition < 0){
        wrongPosition = 0
    }

    println("rightPosition: " + rightPosition + " wrongPosition: " + wrongPosition)

    return Evaluation(rightPosition,wrongPosition)
}