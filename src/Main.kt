//top-level var
var greeting:String = "Welcome"

//define null value
var greet:String? = null

//define func
fun sayWelcome() :String {
    return "Hello dear From function "
}
//func that don't return anything use unit
fun sayBye(): Unit {
    println(sayWelcome())
}
// func return nullable string
fun returnNull(): String? {
return  "nulliii "
}
//func with params
fun funParams(item:String) {
    val msg = "Hello $item func params"
    println(msg)
}

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

//    val greetingToPrint = if(greet !== null) greet else "hi"
//    val greetingToPrint = when(greet) {
//        null-> "hi"
//        else-> greet
//    }
//    println(greetingToPrint)

//    invoke function
    println(sayWelcome())
    println(returnNull())
    sayBye()
    funParams("Love Kotlin")
}
