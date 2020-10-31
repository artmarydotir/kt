//top-level var
var greeting:String = "Welcome"

//define null value
var greet:String? = null

fun main() {
    println("hello kotlin")
  // constant with val, variable with var
    val name:String = "Mary"
    var userName:String = "artMary"
    println(name)
    println(userName)
    println(greet)
  // ##### if statement
    if (greet !== null) {
        println(greet)
    } else {
        println("im else")
    }

    // #### when statement like switch case
    when(greet) {
        null -> println("case null")
        else -> println("when case else")
    }
}
