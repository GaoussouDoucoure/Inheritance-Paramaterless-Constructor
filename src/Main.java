class Animal {
    private String name;

    public Animal() {
        System.out.println("Trace -- in Animal class");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;

    // no constructor

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println("Ruff, ruff!");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal ani = new Animal();

        Dog dog = new Dog();
        Dog dog1 = new Dog();

        // it will automatically output the parent class' parameterless constructor in the console at each instantiation
    }
}