/*
* Franklin Gainer
* 02-20-2025
* Professor Lawrence
* CIS 171-101
* */

fun main()
{

    fun Multinum(multiNumber: Int)
    {
        println("id number $multiNumber")
    }//multipler function that multiplies the number in the constructor

    var num2 = 20;
    val profileBio: String? = null//numer and null elemtnts use for manipulation later

    if(num2 % 2 == 0)//if statement to ensure if the number has a remainder
        println("Yes")
    else
        println("No")

    val nameList = mutableListOf("amy","zach","kai")//modifiable list to add and display names
    println(nameList[1])
    nameList.add("john")
    println(nameList[1])

    for (name in nameList)//for-loop that loops through and prints all the names in the list
        print("name: " + name)

    Multinum(27)

    if (profileBio != null)//null element put throught an if statement
        print("profileBio: is null")
    else
        print("profileBio: is not null")

    class person(firstname: String, lastname: String)
    {
        val fullName: String
        init {
            fullName = "$firstname $lastname"
            println(fullName)
        }
    }//person class that inits the first and last name to make a full name

    val userInput: String
    val userUnputTwo: String
    println("enter you first name please: ")
    userInput = readLine()!!
    println("enter you last name please: ")
    userUnputTwo = readLine()!!
    val personOne = person(userInput,userUnputTwo)
    println("hello ${personOne.fullName}")//user inputs that gets put into the person object and has data printed out

}