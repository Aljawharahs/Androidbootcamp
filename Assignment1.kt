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
    var counter = 0
    while (counter != 10) {
        counter++
        if (temperature == 30) {
            println("its Hot")
        }
        else if (temperature == 20) {
            println("its Comfy")
        }
        else if (temperature == 15) {
            println("its Cold")
        } else {
            println("the Temperature is $temperature , Counter is $counter")
        }
        temperature--
    }
}
