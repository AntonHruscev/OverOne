package exceptions;

class Demo {
    public static void main(String[] args) {
        try {
            Demo2.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Out of bound");
        }

    }
}

class Demo2{
    static void genException() {
        int[] arr = {5, 7, 3, 8, 8, 5, 4, 5};
        int[] arr2 = {0, 0, 2, 0, 2, 0};


            for (int i = 0; i < arr.length; i++)
            try{

                System.out.println(" result a / b = " + arr[i] / arr2[i]);
            }
            catch (ArithmeticException exc) {
                System.out.println("Division zero");
            }

        }
    }
