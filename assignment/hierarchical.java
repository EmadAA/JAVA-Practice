package assignment; // Emad Uddin ADil- ID: 0182210012101154

class Animal {
    String Name;
    String doing;
    void eat() {
        System.out.println( Name + " is "  + doing);
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.Name = "Dog";
        dog.doing = "barking from Animal class";
        dog.eat();  // Accessing method from Animal
        dog.bark(); // Accessing method from Dog

        Cat cat = new Cat();
        cat.Name = "Cat";
        cat.doing = "meowing from Animal Class";
        cat.eat();  // Accessing method from Animal
        cat.meow(); // Accessing method from Cat
    }
}
