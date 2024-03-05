fun main() {
    word("Akirachix")
    print(sentence("Mary", 21))
    println(getStringLength("Mary"))
    myName("Mary","Mary")
    myName("Mary", "Njiru")

}







fun word(name: String) {
    println(name[0] + " " + name[2] + " " + name[3])
}

fun sentence(name: String, age:Int):String{
    var result="Hi my name is $name and i am $age years old"
    return(result)
}

fun getStringLength(word:String):Int{
    var length=word.length
    return(length)
}

fun myName(name1:String, name2:String){
    if(name1.equals(name2)){
        println("That's me!")
    }
    else{
        println("I do not know who that is.")
    }
}
