package equals;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2));
        System.out.println(animal1.hashCode() == animal2.hashCode());
    }
}

class Animal{
    private int id;

    Animal(int id){
        this.id = id;
    }
//    @Override
//    public boolean equals(Object obj){
//        Animal compareAnimal = (Animal) obj;
//        return this.id == compareAnimal.id;
//    }
}
