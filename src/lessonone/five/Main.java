package lessonone.five;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        Vector [] array = OperationsWithVectors.randomArrayOfVectors(n);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].getX());
        }

        Vector vectorOne = new Vector (3,4,5);
        Vector vectorTwo = new Vector (6,7,8);

        Vector vectorThree = OperationsWithVectors.sumOfTwoVectors(vectorOne, vectorTwo);
        vectorThree.setVectorName("Vector Three");
        OperationsWithVectors.printVectorCoordinate(vectorThree, vectorThree.getVectorName());

        vectorThree = OperationsWithVectors.vectorMultiplictaionWithOtherVector(vectorOne,vectorTwo);
        OperationsWithVectors.printVectorCoordinate(vectorThree, vectorThree.getVectorName());

    }
}
