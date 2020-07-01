package interfacescallback.queue;

public class Queue {
    private char [] q;
    private int putloc, getloc;

    Queue(int size){
        q = new char[size + 1];
    }

    void put(char ch){
        if(putloc == q.length - 1){
            System.out.println("Queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char qet(){
        if(getloc == putloc){
            System.out.println("Queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }

    public char[] getQ(){
        return q;
    }
 }
