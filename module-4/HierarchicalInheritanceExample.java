public class HierarchicalInheritanceExample {
public static void main(String[] args) {
// Creating object of Dog class
Dog d = new Dog();
d.eat(); // inherited from Animal
d.bark(); // Dog's own method
System.out.println(); // blank line for clarity
// Creating object of Cat class
Cat c = new Cat();
c.eat(); // inherited from Animal
c.meow(); // Cat's own method
}
}
// Parent class (Super class)
class Animal {
void eat() {
System.out.println("Animals can eat");
}
}
// Child class 1
class Dog extends Animal {
void bark() {
System.out.println("Dog can bark");
}
}
// Child class 2
class Cat extends Animal {
void meow() {
System.out.println("Cat can meow");
}
}
