fun main()
{
    println("Enter 9*9 Sudoko matrtix for check if vaild or not ")
    val matrix = mutableListOf<MutableList<Char>>()

    for (i in 0 until 9) {
        val rowInput = readLine()!!.split(' ').map { it[0] } 
        matrix.add(rowInput.toMutableList())
    }

    val result = sudokuChecker(matrix)

    if (result) {
        println("The Sudoku matrix is valid!")
    } else {
        println("The Sudoku matrix is invalid.")
    }

}
fun sudokuChecker(matrix: List<List<Char>>): Boolean {

    if (matrix.size != 9 || matrix.any { it.size != 9 }) {
        return false 
    }
   
    for (row in matrix) {
        for (cell in row) {
            if (cell != '-' && (cell !in '1'..'9')) {
                return false
            }
        }
    }

    //check duplicate in row or column or subgrid
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            val num = matrix[i][j]
            if (num != '-') {
                for (k in matrix[i].indices) {
                    if (k != j && matrix[i][k] == num) {
                        return false
                    }
                }

                for (k in matrix.indices) {
                    if (k != i && matrix[k][j] == num) {
                        return false
                    }
                }
                
                val boxRowStart = (i / 3) * 3
                val boxColStart = (j / 3) * 3
                for (row in boxRowStart until boxRowStart + 3) {
                    for (col in boxColStart until boxColStart + 3) {
                        if (row != i && col != j && matrix[row][col] == num) {
                            return false
                        }
                    }
                }
            }
        }
    }

    return true
}