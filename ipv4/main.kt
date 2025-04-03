/* write these two lines in terminal (first line to translate the code and the second to run ):

kotlinc ipv4\main.kt -include-runtime -d ipv4\main.jar
java -jar ipv4\main.jar

the main will change to file name and the path also like testcase_ip--> ipv4\main.......
*/

fun main()
{
    

}

fun ipv4Checker(ip:String):Boolean{
    //logic
    return false
}






















// fun ipv4 (number:String):Boolean{
//     var a:String = ""
//     var dots:Int = 0
//     var i:Int=0
//     var ok:Boolean = true

//     while (i<number.length) {
//         var j = i
//         while (number[i] != '.') {
//             a += number[j]
//             j++
//         }
//         i = j
//         dots++
//         var number2:Int= a.toInt() 
//         if (!(number2 in 0..255)) ok = false
//     }
//             if (!ok || dots > 3) return false
            
//             return true
// }