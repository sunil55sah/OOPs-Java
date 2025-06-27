package Inheritance;

//Base class (Grandparent)
class LivingBeing {
 void breathe() {
     System.out.println("LivingBeing breathes.");
 }
}

//Intermediate class (Parent) inherits LivingBeing
class Plant extends LivingBeing {
 void photosynthesize() {
     System.out.println("Plant performs photosynthesis.");
 }
}

//Derived class (Child) inherits Plant
class Flower extends Plant {
 void bloom() {
     System.out.println("Flower blooms.");
 }
}

public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     Flower rose = new Flower();

     // Inherited from LivingBeing (grandparent)
     rose.breathe();

     // Inherited from Plant (parent)
     rose.photosynthesize();

     // Own method
     rose.bloom();
 }
}
