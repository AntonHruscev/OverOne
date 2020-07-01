package interfacescallback.button;

public class EventsApp {
    public static void main(String[] args) {
        Button tv = new Button(new tvButton(true));
        tv.click();
        Button printer = new Button(new printButton(false));
        printer.click();
        Button but = new Button(new ButtonClickHandler(true));
        but.click();
    }

}
