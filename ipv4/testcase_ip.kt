fun main(){

    checkIp(
        name="when any segment is empty return wrong",
        result=ipv4Checker("192.168..1"),
        correctResult=false
    )
    checkIp(
        name="when any segment has leading zero return wrong",
        result=ipv4Checker("192.00.1.2"),
        correctResult=false
    )
    checkIp(
        name="when any segment has number not between 0 and 255 return wrong",
        result=ipv4Checker("300.200.192.1"),
        correctResult=false
    )
    checkIp(
        name="when any segment has character instead of number  return wrong",
        result=ipv4Checker(" 192.a.4.1"),
        correctResult=false
    )
    checkIp(
        name="when the input has not 4 segment(less than) return wrong",
        result=ipv4Checker("192.168.1"),
        correctResult=false
    )
    checkIp(
        name="when the input has not 4 segment(greater than) return wrong",
        result=ipv4Checker("192.168.11.1.5"),
        correctResult=false
    )
    checkIp(
        name="when the input has another character instead of dot (.) return wrong",
        result=ipv4Checker("192/2/5.1"),
        correctResult=false
    )
    checkIp(
        name="when the input has space between the segments return wrong",
        result=ipv4Checker("192. 2.5.1"),
        correctResult=false
    )
     checkIp(
        name="when the input is empty return wrong",
        result=ipv4Checker(""),
        correctResult=false
    )
    checkIp(
        name="when the input achieves what is required return true",
        result=ipv4Checker("192.168.1.1"),
        correctResult=true
    )

}

fun checkIp(name:String,result:Boolean,correctResult:Boolean){
    if(result==correctResult){
        println("Success-> $name")
    }else{
        println("Faild-> $name")
    }
}








/*
kotlinc ipv4\testcase_ip.kt -include-runtime -d ipv4\testcase_ip.jar
java -jar ipv4\testcase_ip.jar
 */
