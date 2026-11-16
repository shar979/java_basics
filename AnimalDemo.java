class Animal {

    String name;


    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " says Meow!");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");

        dog.speak();
        cat.speak();
    }
}
