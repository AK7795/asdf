package javainheritance;

public class Rbii {

    public void getinterestrate(){
        System.out.println("Interest rate of rbi is : 7 ");
    }

}

class sbi extends Rbii{
    @Override
   public void getinterestrate(){
        System.out.println("Interest rate of sbi is : 7.5 ");
    }
}

class axis extends Rbii{
    @Override
    public void getinterestrate(){
        System.out.println("Interest rate of axis is : 8 ");
    }
}
class icici extends Rbii{
    @Override
    public void getinterestrate(){
        System.out.println("Interest rate of icici is : 7.5 ");
    }
}

class bank{
    public static void main(String[] args) {
        sbi s = new sbi();
        axis a = new axis();
        icici i =  new icici();

        s.getinterestrate();
        a.getinterestrate();
        i.getinterestrate();
    }
}