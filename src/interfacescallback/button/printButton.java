package interfacescallback.button;

public class printButton implements EventHandler{
    boolean n;
    printButton(boolean n){
        this.n = n;
    }
    @Override
    public void execute() {
        if(n == false){
            System.out.println("Printer turned off");
        } else {
            System.out.println("Printer turned on");
        }
    }
}
