package lessonone.one.list;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int listLength = scanner.nextInt();
//        int target = scanner.nextInt();
        int target = 2;

        ArrayList<Integer> arrayList = new ArrayList <Integer>();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,2);

//        for(int i = 0; i < listLength; i++){
//            int x = (int)(Math.random() * 10);
//            arrayList.add(x);
//        }
        System.out.println(arrayList);

        for( int i = 0; i <= arrayList.size() - 1; i++){
            if(arrayList.get(i) == target){
                arrayList.remove(i);
                i = 0;
            }
//            arrayList.add(arrayList.size() - 1, 0);
        }

        System.out.println(arrayList);
    }
}
