// Parent Class (Base Class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child Class (Derived Class) - Inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Main Class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Child class can access both parent and child methods
        d.eat();   // Inherited from Animal
        d.bark();  // Defined in Dog
    }
}

