package interfacescallback.button;

public class ButtonClickHandler implements  EventHandler{
    boolean n;

    ButtonClickHandler(boolean n){
        this.n = n;
    }
    @Override
    public void execute(){
        if(n == true) {
            System.out.println("Button has been pressed");
        } else {
            System.out.println("Button hasn't been pressed");
        }
    }

}
