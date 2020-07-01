package interfacescallback.queue;

public class Main {
    public static void main(String[] args) {
        Queue bigQueue = new Queue(1000);
        Queue smallQueue  = new Queue(10);
        char ch;

        for(int i = 0; i < 26; i++){
            bigQueue.put((char)('A' + i));
        }

        for(int i = 0; i < 26; i++){
            ch = bigQueue.qet();
            if(ch != (char) 0){
                System.out.print(ch + " ");
            }
        }
        System.out.println();
        System.out.println("Mistakes");
        for(int i = 0; i < 5; i ++){
            System.out.println("Try to save" + (char)('Z' - i));
            smallQueue.put((char)('Z' - i));
        }


    }
}
