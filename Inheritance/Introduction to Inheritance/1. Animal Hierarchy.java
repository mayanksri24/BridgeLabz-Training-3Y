// Superclass
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the Dog says: Woof Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the Cat says: Meow Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the Bird says: Tweet Tweet!");
    }
}

// Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy", 5);
        Animal a2 = new Cat("Kitty", 3);
        Animal a3 = new Bird("Mithu", 2);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}

