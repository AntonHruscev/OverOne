package lessonone.four;

public class Main{
    public static void main(String[] args) {
        int[][]  array = new int[][]{{2,5,2},{3,3,3},{4,1,4}};

        printMatrix(array);

        int sumFirstLine = sumLine(array, 0);
        int sumSecondLine = sumLine(array, 1);
        int sumThirdLine = sumLine(array, 2);

        int sumFirstColumn = sumColumn(array, 0);
        int sumSecondColumn = sumColumn(array, 1);
        int sumThirdColumn = sumColumn(array, 2);

        int sumFirstDiagonal = sumDiagonal(array, 0);
        int sumSecondDiagonal = sumDiagonal(array, 1);

        checkerForMagicSquare(sumFirstLine, sumSecondLine, sumThirdLine,
                sumFirstColumn, sumSecondColumn, sumThirdColumn,
                sumFirstDiagonal, sumSecondDiagonal);



    }
    static int sumLine(int [][] array, int lineNumber){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[lineNumber][i];
        }
        return sum;
    }

    static int sumColumn(int[][] array, int columnNumber) {
        int sum = 0;
        for ( int i = 0; i < array.length; i++ ){
            sum = sum + array[i][columnNumber];
        }
        return sum;
    }
    static int sumDiagonal(int [][] array, int numberOfDiagonal) {
        int sum = 0;
        int elementInRightDiagonal = array.length - 1;

        if (numberOfDiagonal == 0) {
            for (int i = 0; i < array.length; i++) {
                int  j = i;
                sum = sum + array[i][j];
            }
        } else {
                    for(int i = 0; i < array.length; i ++){
                        sum = sum + array[i][elementInRightDiagonal ];
                        elementInRightDiagonal --;
                    }
            }
       return sum;
    }
    static void checkerForMagicSquare(int a, int b, int c, int d,
                                      int e, int f, int g , int i) {
        if ((a == b)&&(a ==c)&&(a == d)&&(a == e)&& (a == f) && (a == g)
        &&(a == i)){
            System.out.println("Square is magic");
        } else {
            System.out.println("Square is not magic");
        }
    }
    static void printMatrix(int [][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}