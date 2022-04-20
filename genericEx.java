import java.util.*;

   /* class Myarray<T>{ // T : used as type variable --- declare generic class
        T element;
        void setElement(T element){this.element = element;}
        T getElement() { return element;}}
    */
    /*
     * type variable's polymorphism 
     */
    class AnimalList<T>{
        ArrayList<T> al = new ArrayList<T>();  // using reference variables? 

        void add(T animal) {al.add(animal); }
        T get(int index) {return al.get(index);}
        boolean remove(T animal){return al.remove(animal);}
        int size(){return al.size();}
    }
    class LandAnimals{public void crying(){System.out.println("Animal living in Land");}}
    class LandAnimal extends LandAnimals{public void crying(){System.out.println("Animal living in Land");}}
    class cat extends LandAnimal{public void crying(){System.out.println("Meow Meow");}}
    class dog extends LandAnimal{public void crying(){System.out.println("Meong Meong");}}
    class Sparrow { public void crying() { System.out.println("Jack Jack"); } }


    public class genericEx {
        public static void main(String[] args){
            //MyArray<Integer> myArr = new MyArray<Integer>();
            
            AnimalList<LandAnimals> landAnimal = new AnimalList<LandAnimals>();
            landAnimal.add(new LandAnimal());
            landAnimal.add(new cat());
            landAnimal.add(new dog());
         // landAnimal.add(new Sparrow());
            Sparrow sp = new Sparrow();
            sp.crying();
       

            for(int i =0 ; i< landAnimal.size() ; i++){
               landAnimal.get(i).crying();
            }

           // landAnimal.get(2).crying();
        }
    }

    /**
     * Arrays class package in java.util.*; (java.util.Arrays;)
     * to be continued about useful Arrays class's method
     * 
     */

