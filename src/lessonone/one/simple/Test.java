package lessonone.one.simple;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{1, 10, 2, 3, 10, 10, 3, 50};
        int target = 10;

        showArray(array);

        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                changeArray(array,target);
                i = 0;
            }
        }
        showArray(array);
    }



    static  int[] changeArray(int array [], int target){
        for (int i = 0; i < array.length - 1; i++) {
            if ((array[i] == target)) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        return  array;
    }

    static void showArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
