package interfacescallback.button;

public class tvButton implements EventHandler{
    boolean n;
    tvButton(boolean n){
        this.n = n;
    }
    @Override
    public void execute() {
        if(n == false){
            System.out.println("Tv turned off");
        } else {
            System.out.println("Tv turned on");
        }
    }
}
