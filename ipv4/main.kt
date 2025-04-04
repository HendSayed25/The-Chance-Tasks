/* 
 This Program to check for ipv4 syntax if valid or not Using TDD approach
*/

fun main()
{
   var ipNumber:String?=null

   println("Enter IpV4 to Test If True Or False:")
   ipNumber=readLine()!!

   var result=ipv4Checker(ipNumber)
   println("This ip is $result syntax")

}

fun ipv4Checker(ip:String):Boolean{
    var ipParts=ip.split('.')

    if(ipParts.size!=4)return false // this means we not have exactly 3 dots

    for(i in ipParts){
       if(!((i>="0")&&(i<="255"))||(i[0]=='0'&&i.length>1)) return false  // second condition for leading zero
    }
    
     return true
}











/* write these two lines in terminal (first line to translate the code and the second to run ):

kotlinc ipv4\main.kt -include-runtime -d ipv4\main.jar
java -jar ipv4\main.jar

the main will change to file name and the path also like testcase_ip--> ipv4\main.......
*/