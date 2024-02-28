package assignment; // Emad Uddin ADil- ID: 0182210012101154
 class Parent { // Parent class
        void parentMethod() {
            System.out.println(" This is Parent method");
        }
    }   
    class Child extends Parent {  // Child class
        void childMethod() {
            System.out.println("This is Child method");
        }
    }   
    public class single { 
        public static void main(String[] args) {
            Child childObj = new Child();
            childObj.parentMethod(); // Accessing parent class method
            childObj.childMethod(); // Accessing child class method
        }
  }
