package lessonone.two;

import java.util.ArrayList;

public class Box {
        public static void main(String[] args) {
                ArrayList<Shape> arrayList = new ArrayList<Shape>();

                for( int i = 0; i < 9; i++){
                        arrayList.add(i , new Shape());
                }

                for ( int i = 0; i < arrayList.size() - 1; i++){
                        System.out.println(arrayList.get(i));
                }

         }

}
