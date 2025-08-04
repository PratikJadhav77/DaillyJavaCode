 // Parent class (Super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();   // Inherited from Animal
        myDog.bark();  // Defined in Dog
    }
}

