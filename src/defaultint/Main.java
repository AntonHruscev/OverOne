package defaultint;

public class Main {
    public static void main(String[] args) {
        DefaultMeth defaultMeth = new Test();
        int i = defaultMeth.methDef(8);
        System.out.println(i);

        int j = defaultMeth.methNonDef(10);
        System.out.println(j);

        int a = DefaultMeth.devision(5);
        System.out.println(a);

    }
}
