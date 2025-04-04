/*
we have 9*9 matrix 
*/
fun main(){
    checksudoku(
        name = "when find Duplicate in Row return false",
        result = sudokuChecker(
            listOf(
                listOf('1','1','2','3','4','5','6','7','8'),
                listOf('4','5','6','7','8','9','1','2','3'),
                listOf('7','8','9','1','2','3','4','5','6'),
                listOf('2','3','4','5','6','7','8','9','1'),
                listOf('5','6','7','8','9','1','2','3','4'),
                listOf('8','9','1','2','3','4','5','6','7'),
                listOf('3','4','5','6','7','8','9','1','2'),
                listOf('6','7','8','9','1','2','3','4','5'),
                listOf('9','2','3','4','5','6','7','8','1')
            )
        ),
        correctResult = false
    )

    checksudoku(
        name = "when find Duplicate in Column return false",
        result = sudokuChecker(
            listOf(
                listOf('1','2','3','4','5','6','7','8','9'),
                listOf('1','4','5','6','7','8','9','2','3'),
                listOf('7','8','9','1','2','3','4','5','6'),
                listOf('2','3','4','5','6','7','8','9','1'),
                listOf('5','6','7','8','9','1','2','3','4'),
                listOf('8','9','1','2','3','4','5','6','7'),
                listOf('3','4','5','6','7','8','9','1','2'),
                listOf('6','7','8','9','1','2','3','4','5'),
                listOf('9','1','2','3','4','5','6','7','8')
            )
        ),
        correctResult = false
    )

    checksudoku(
        name = "when find Duplicate in 3x3 Square return false",
        result = sudokuChecker(
            listOf(
                listOf('1','2','3','4','5','6','7','8','9'),
                listOf('4','5','6','7','8','9','1','2','3'),
                listOf('7','8','1','1','2','3','4','5','6'), // duplicate '1' in top-right 3x3
                listOf('2','3','4','5','6','7','8','9','1'),
                listOf('5','6','7','8','9','1','2','3','4'),
                listOf('8','9','1','2','3','4','5','6','7'),
                listOf('3','4','5','6','7','8','9','1','2'),
                listOf('6','7','8','9','1','2','3','4','5'),
                listOf('9','1','2','3','4','5','6','7','8')
            )
        ),
        correctResult = false
    )

    checksudoku(
        name = "when find number not in range of valid numbers return false",
        result = sudokuChecker(
            listOf(
                listOf('1','2','3','4','5','6','7','8','9'),
                listOf('4','5','6','7','8','9','1','2','3'),
                listOf('7','8','9','1','2','3','4','5','6'),
                listOf('2','3','4','5','6','7','8','9','1'),
                listOf('5','6','7','8','9','1','2','3','4'),
                listOf('8','9','1','2','3','4','5','6','7'),
                listOf('3','4','5','6','7','8','9','1','2'),
                listOf('6','7','8','9','1','2','3','4','5'),
                listOf('9','0','2','3','4','5','6','7','8') // 0 is invalid
            )
        ),
        correctResult = false
    )

    checksudoku(
        name = "when find empty cells return false",
        result = sudokuChecker(
            listOf(
                listOf('1','2','3','4','5','6','7','8','9'),
                listOf('4','5','6','7','8','9','1','2','3'),
                listOf('7','8','9','1','2','3','4','5','6'),
                listOf('2','3','4','5','6','7','8','9','1'),
                listOf('5','6','7','8','9','1','2','3','4'),
                listOf('8','9','1','2','3','4','5','6','7'),
                listOf('3','4','5','6','7','8','9','1','2'),
                listOf('6','7','8','9','1','2','3','4','5'),
                listOf('9',' ','2','3','4','5','6','7','8') // space
            )
        ),
        correctResult = false
    )

    checksudoku(
        name = "when find special character in matrix return false",
        result = sudokuChecker(
            listOf(
                listOf('1','2','-','-','-','6','7','8','9'),
                listOf('-','5','-','7','8','9','1','2','3'),
                listOf('7','-','9','1','2','3','4','5','6'),
                listOf('2','-','4','-','6','-','8','9','1'),
                listOf('5','-','7','8','9','1','-','3','4'),
                listOf('8','9','1','2','3','4','5','-','7'),
                listOf('3','4','5','6','7','-','9','1','2'),
                listOf('6','7','8','9','1','2','3','4','5'),
                listOf('9','@','2','3','4','5','6','7','8') // invalid character
            )
        ),
        correctResult = false
    )

    checksudoku(
    name = "when matrix has less than 9 rows return false",
    result = sudokuChecker(
        listOf(
            listOf('1','2','3','4','5','6','7','8','9'),
            listOf('4','5','6','7','8','9','1','2','3')
        )
    ),
    correctResult = false
   )

   checksudoku(
    name = "when matrix is empty, return false",
    result = sudokuChecker(listOf()),
    correctResult = false
)
   
   checksudoku(
    name = "when matrix has less than 9 Column return false",
    result = sudokuChecker(
        listOf(
                listOf('5','3','-','6','7','8','9'),
                listOf('6','7','2','1','9','5','3'),
                listOf('1','9','8','-','4','2','5'),
                listOf('8','-','9','7','6','1','4'),
                listOf('4','2','-','8','5','3','7'),
                listOf('7','1','3','-','2','-','8'),
                listOf('9','6','1','5','3','7','2'),
                listOf('2','8','7','4','1','9','-'),
                listOf('3','4','5','2','8','6','1')
        )
    ),
    correctResult = false
   )


    checksudoku(
        name = "when all numbers are unique and valid return true",
        result = sudokuChecker(
            listOf(
                listOf('5','3','-','6','7','8','9','1','2'),
                listOf('6','7','2','1','9','5','3','4','8'),
                listOf('1','9','-','-','4','2','5','6','7'),
                listOf('8','5','-','-','6','1','-','-','-'),
                listOf('-','2','-','-','-','3','-','-','1'),
                listOf('7','1','-','-','-','4','8','5','6'),
                listOf('-','6','1','-','3','-','2','8','4'),
                listOf('2','8','7','-','1','-','6','-','5'),
                listOf('3','4','5','2','8','-','1','7','9')
            )
        ),
        correctResult = true
    )
}

fun checksudoku(name:String,result:Boolean,correctResult:Boolean){
    if(result==correctResult){
        println("Success-> $name")
    }else{
        println("Faild-> $name")
    }
}

