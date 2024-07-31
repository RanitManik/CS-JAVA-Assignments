class Animal {
    void eat() {
        System.out.println("All animals can eat...");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dogs are barking...");
    }
}
