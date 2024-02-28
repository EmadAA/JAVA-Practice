package assignment; // Emad Uddin ADil- ID: 0182210012101154
    class DADA {
        void dada() {
            System.out.println("Dada's method");
        }
    }   
    class BABA extends DADA {
        void baba() {
            System.out.println("Baba's method");
        }
    }    
    class CHELE extends BABA {
        void chele() {
            System.out.println("Chele's method");
        }
    }   
    public class Multilevel {
        public static void main(String[] args) {
            CHELE childObj = new CHELE();
            childObj.dada(); // Accessing method from GrandParent
            childObj.baba(); // Accessing method from Parent
            childObj.chele(); // Accessing method from Child
        }
    } 

