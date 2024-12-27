package patterns.creational.simplefactory;

// Product interface
interface Animal {
    void makeSound();
}

// Concrete products
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Simple Factory class
// 一个工厂类，根据不同的输入，创建不同的 product
class AnimalFactory {
    // Factory method that creates and returns different types of animals
    public static Animal createAnimal(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }

    // test
    public static void main(String[] args) {
        // Create animals using the factory
        Animal dog = AnimalFactory.createAnimal("dog");
        Animal cat = AnimalFactory.createAnimal("cat");

        // Make the animals sound
        dog.makeSound();  // Output: Woof!
        cat.makeSound();  // Output: Meow!

        try {
            // This will throw an exception
            Animal unknown = AnimalFactory.createAnimal("elephant");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

