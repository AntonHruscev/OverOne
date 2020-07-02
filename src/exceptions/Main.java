package exceptions;

public class Main {
    public static void main(String[] args) {
        int [] array = {0,1,2,3};

        try{
            demoException();
        }
        catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Вы пытаетесь выйти за границы массива");
        }

        System.out.println("Прграмма продолжает выполняться !");
    }
    static void demoException(){
        int [] array = {0,1,2,3};
        array[10] = 0;
    }
}
