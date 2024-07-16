package Lab6;

public class Duck extends Animal implements Flyable, Pettable {

    void clean(Animal animal) {
        System.out.println(this + "is cleaning " + animal);
    }

    @Override
    public void sound(){
        System.out.println("Quack Quack!!");
    }
    @Override
    public void fly() {
        System.out.println("I believe I can fly!!");
    }
    @Override
    public void glide() {
        System.out.println("Ducks can glide!!");
    }
    @Override
    public void land() {
        System.out.println("Ducks can land!!");
    }
    @Override
    public void canBePet(){
        System.out.println("I can be your pet!!");
    }
    @Override
    public void play(){
        System.out.println("You can play with me!!");
    }
    
}
