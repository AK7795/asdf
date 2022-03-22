package javainheritance;

public class ann2 {

    public void display(){
            System.out.println("hell0 children");
        }
    }

    class ch extends ann2 {
        @Override
        public void display() {
            super.display();
            // System.out.println("hello");
        }

        void cal(){
            System.out.println("calculate");
        }

        public @interface myann{

            int age() default 18;
            String name();
        }

            @myann(
                    name = "akshay",age = 22
            )


        public static void main(String[] args) {
           ch n = new ch();
            n.display();


            @SuppressWarnings({"deprecated","unused"})
            int x;
            n.cal();
                System.out.println();

        }
    }