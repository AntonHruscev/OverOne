package interfacescallback.icharq;

public class FixedQueue implements ICharQ{
    /*
     0   1   2   3
    [a] [b] [c] [c]
    */

    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size){
        this.q = new char [size + 1];// очередь пустого размера
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch){
        if(putloc == q.length - 1){
            System.out.println("Очередь заполнена");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get(){
        if(getloc == putloc){
            System.out.println("Queue empty");
            return 0;
        }
        getloc++;
        return q[getloc];
    }
}
