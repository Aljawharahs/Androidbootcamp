fun main() {
    // Part1
    for (i in 0..100) {
        if (i == 71) {
            println("ITS OVER 71!!!")
            break
        } else {
            println(i)
        }
    }
    //  Part2
    var temperature = 35
    while (temperature != 25){ // 10 iteration
        when {
            temperature == 30 -> println("its Hot")
            temperature == 20 -> println("its Comfy")
            temperature == 15 -> println("its Cold")
            else -> println("the Temperature is $temperature ")
        }
        temperature--
        }
    }

