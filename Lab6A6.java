class Parent {
    String message = ("Hello from Parent class");
}

class Child extends Parent {
    String message = ("Hello from Child class");

    void display() {
        System.out.println(super.message);
    }
}

public class Lab6A6 {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
