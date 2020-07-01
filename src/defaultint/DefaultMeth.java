package defaultint;

public interface DefaultMeth {
    static int devision(int i){
        return  i % 2;
    }

    int methNonDef(int i);

    default int methDef(int i){
        return i + 10;
    }
}
