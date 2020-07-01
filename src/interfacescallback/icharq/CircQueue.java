package interfacescallback.icharq;

public class CircQueue implements  ICharQ{
    /*
     0   1   2   3   4   5   6   7   8   9
     g
    [a] [b] [c] [d] [e] [f] [i] [j] [k] [l]
     p
   */
    private char q[];
    private int putloc, getloc;

    public CircQueue(int size){
        this.q = new char [size + 1];// очередь пустого размера
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch){
        if((putloc == q.length - 1) & (getloc == 0)){
            System.out.println("Queue is full");
            return;
        }
        putloc++;
        if(putloc == q.length) putloc = 0;
        q[putloc] = ch;
    }

    @Override
    public char get(){
        if(getloc == putloc){
            System.out.println("Queue is empty");
            return (char) 0;
        }

        getloc++;
        if(getloc == q.length) getloc = 0;

        return q[getloc];
    }


}
