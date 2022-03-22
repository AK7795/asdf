package javainheritance;

public class ann {
public void display(){
    System.out.println("hell0 children");
}
}

 class ch1 extends ann{
     @Override
     public void display() {
         super.display();
        // System.out.println("hello");
     }


     public static void main(String[] args) {
         ch1 c1 = new ch1();
         c1.display();

         @SuppressWarnings({"deprecated","unused"})
                 int x;

     }
}

