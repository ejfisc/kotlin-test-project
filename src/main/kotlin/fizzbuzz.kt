fun main(){
    println("Fizz Buzz")

    for(i in 1..105){
        print("$i) ")
        when {
            i % 3 == 0 && i % 5 == 0 -> println("fizz buzz")
            i % 3 == 0 -> println("fizz")
            i % 5 == 0 -> println("buzz")
            else -> println()
        }

    }
}