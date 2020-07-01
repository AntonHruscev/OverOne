package lessonone.five;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class OperationsWithVectors {

    static void printVectorCoordinate(Vector vector, String vectorName){
        System.out.println("Coordinates of " + vectorName + " :\n" +
                            "X: " + vector.getX() +
                           "\nY: " + vector.getY() +
                            "\nZ: " + vector.getZ());
    }

    static double vectorLength(Vector vector){

        double length = Math.sqrt(Math.pow(vector.getX(),2)
                + Math.pow(vector.getY(),2)
                + Math.pow(vector.getZ(),2));
        return length;
    }

    static double vectorScalarMultiplication(Vector vOne, Vector vTwo){
        double scalarMultiplication = (vOne.getX()*vTwo.getX())
                +(vOne.getY()*vTwo.getY())
                + (vOne.getZ()*vTwo.getZ());
        return scalarMultiplication;
    }

    static Vector vectorMultiplictaionWithOtherVector(Vector vOne, Vector vTwo){
        Vector vectorResult = new Vector(
                vOne.getY() * vTwo.getZ() - vOne.getZ() * vTwo.getY(),
                vOne.getZ() * vTwo.getX() - vOne.getX() * vTwo.getZ(),
                vOne.getX() * vTwo.getY() - vOne.getY() * vTwo.getX());
        return vectorResult;
    }

    static  Vector sumOfTwoVectors(Vector vOne, Vector vTwo){

        Vector vectorResult = new Vector(vOne.getX()+vTwo.getX(),
                vOne.getY() + vTwo.getY(),
                vOne.getZ() + vTwo.getZ());

        return vectorResult;
    }

    static Vector differenceOfTwoVectors(Vector vOne, Vector vTwo){
        Vector vectorResult = new Vector(
                vOne.getX() - vTwo.getX(),
                vOne.getY() - vTwo.getY(),
                vOne.getZ() - vTwo.getZ()
        );
        return vectorResult;
    }

    static Vector[] randomArrayOfVectors(int n){
        Vector[] vectorArray = new Vector[n];

        for(int i = 0; i < n; i++){
            vectorArray[i] = new Vector(Math.random()*10,
                    Math.random()*10,
                    Math.random()*10);
        }
        return vectorArray;
    }
}
