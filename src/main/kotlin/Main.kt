import java.util.Scanner
import javax.print.attribute.standard.MediaSize.Other

fun main(args: Array<String>) {
    val scn =Scanner(System.`in`)
    println("Enter the number")
    var N :Int=scn.nextInt()
    var C:Int=N
    var b :Int=0
    val mylist = mutableListOf<String>()
   scn.nextLine()
    //filling the list
    while(N>0){
        println("Enter name :")
        val name :String =scn.nextLine()
        mylist.add(name)
        N--
    }
    while(C>0)
    {
        if(mylist[b].contains('a',ignoreCase = true) or mylist[b].contains('m',ignoreCase = true))
            println(mylist[b].uppercase())
        C--
        b++

    }


}