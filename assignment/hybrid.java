package assignment; // Emad Uddin ADil- ID: 0182210012101154
class GrandParent {
    void grandparentMethod() {
        System.out.println("Grandparent method");
    }
}

// Parent class inheriting from Grandparent
class Parent extends GrandParent {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    void childMethod() {
        System.out.println("Child method");
    }
}

public class hybrid {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.grandparentMethod(); // Accessing method from Grandparent
        childObj.parentMethod();      // Accessing method from Parent
        childObj.childMethod();       // Accessing method from Child
    }
}


