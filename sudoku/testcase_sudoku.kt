/*
we have 9*9 matrix and we take 3*3 of it to check:
*/
fun main(){

    checksudoku(
        name="when find Duplicate in Row return false",
        result= sudokuChecker(
        listOf(
            listOf('1', '1', '2'),
            listOf('3', '4', '5'),
            listOf('6', '7', '8')
        )
    ), 
    correctResult=false
    )

    checksudoku(
        name="when find Duplicate in Column return false",
        result= sudokuChecker(
        listOf(
            listOf('1', '2', '3'),
            listOf('1', '5', '6'),
            listOf('7', '8', '9')
        )
    ), 
    correctResult=false
    )

    checksudoku(
        name="when find Duplicate in Diagonal return false",
        result= sudokuChecker(
        listOf(
            listOf('1', '2', '3'),
            listOf('4', '1', '6'),
            listOf('7', '8', '9')
        )
    ), 
    correctResult=false
    )

    checksudoku(
        name="when find Duplicate in 3x3 Square return false",
        result= sudokuChecker(
        listOf(
            listOf('1', '2', '3'),
            listOf('4', '5', '6'),
            listOf('7', '8', '4')
        )
    ), 
    correctResult=false
    )

    checksudoku(
        name="when find number not in range of valid numbers(in this case will check from '1' to '9')",
        result= sudokuChecker(
        listOf(
            listOf('1', '2', '3'),
            listOf('4', '5', '11'),
            listOf('7', '8', '9')
        )
    ), 
    correctResult=false
    )

    checksudoku(
        name="when find empty cells return false",
        result= sudokuChecker(
        listOf(
            listOf(' ', '2', '3'),
            listOf('4', '5', '6'),
            listOf('7', '8', '9')
        )
    ), 
    correctResult=false
    )

    checksudoku(
        name="when find special character in matrix return false",
        result= sudokuChecker(
        listOf(
            listOf('1', '2', '#'),
            listOf('4', '5', '6'),
            listOf('7', '8', '9')
        )
    ), 
    correctResult=false
    )

    checksudoku(
        name="when all numbers are unique and valid return true",
        result= sudokuChecker(
        listOf(
            listOf('1', '2', '3'),
            listOf('4', '5', '6'),
            listOf('7', '8', '9')
        )
    ), 
    correctResult=true
    )

}

fun checksudoku(name:String,result:Boolean,correctResult:Boolean){
    if(result==correctResult){
        println("Success-> $name")
    }else{
        println("Faild-> $name")
    }
}
