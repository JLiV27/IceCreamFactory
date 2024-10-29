public class Cake {

    boolean isIceCream;
    int diameter;
    String flavor;

    public Cake(){

    }

    public void PrintInfo(){
       if (isIceCream){
           System.out.println("This " + flavor + " ice cream cake is " + diameter + " inches across");
       }
       else{
           System.out.println("This " + flavor + " cake is " + diameter + " inches across");
       }

        System.out.println("Flavor: " + flavor);
        System.out.println("Ice Cream Cake: " + isIceCream);
        System.out.println("Diameter: " + diameter);
    }
}
