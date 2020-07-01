package interfacescallback.button;

public class Button {
    EventHandler eventHandler;

    public Button(EventHandler action) {
        this.eventHandler = action;
    }
    public void click(){
        this.eventHandler.execute();
    }
}
