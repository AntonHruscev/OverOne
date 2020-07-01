package interfacescallback.icharq;

public class Main {
    public static void main(String[] args) {
        FixedQueue q1 = new FixedQueue(10);
        CircQueue q2 = new CircQueue(10);
        DynamicQueue q3 = new DynamicQueue(10);

        char ch;

        ICharQ iQ;

        iQ = q1;

        for(int i = 0; i < 10; i++){
            iQ.put((char) ('a' + i));
            System.out.print(iQ.get() + " ");
        }
        System.out.println();
        iQ = q2;

        for(int i = 0; i < 10; i++){
            iQ.put((char) ('a' + i));
            System.out.print(iQ.get() + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        for(int i = 10; i < 20; i++){
            iQ.put((char) ('a' + i));
            System.out.print(iQ.get() + " ");
        }

        iQ = q3;

        for(int i = 0; i < 20; i ++ ){
            iQ.put((char)('a' + i));
            System.out.println(iQ.get());
        }
    }
 }
