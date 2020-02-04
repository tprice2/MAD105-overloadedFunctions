/* Pseudocode

Variables: selection, number, name, businessName

Process:
First, ask the user which type of customer they area.
Store their answer into the variable selection
While the selection value doesn't equal 3 (the value for quitting),continue in this loop.
If the selection value is 1, ask the user to input a name and number.
If two variables are sent through the print function, only the name and number is printed.
If the selection value is 2, ask th user to input a name, number, and business name.
If three variables are sent to the print function, then these three variables are printed.

*/


fun print(number: String, name: String) {
    println("Info: " + number + "|" + name)
    return
}

fun print(number: String, name: String, businessName: String) {
    println("Info: " + number + "|" + name + "|" + businessName)
    return
}

fun main(){
    do {
        println("Please enter the type of customer you are:")
        println("1. Residential")
        println("2. Business")
        println("3. Exit")
        val selection = readLine()!!.toInt()
        if (selection == 1) {
            println("Please enter your phone number:")
            val number = readLine()!!
            println("Please enter your name:")
            val name = readLine()!!

            print(number, name)
        } else if (selection == 2) {
            println("Please enter your phone number:")
            val number = readLine()!!
            println("Please enter your name:")
            val name = readLine()!!
            println("Please enter your business name:")
            val businessName = readLine()!!
            print(number, name, businessName)

        } else if(selection ==3) {
            println("Goodbye!")
        }
        else {
            println("Please enter a valid number.")
        }
    }
    while(selection != 3)
}