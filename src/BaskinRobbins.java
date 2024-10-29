public class BaskinRobbins {

    String location;
    int squareFeet;
    boolean isOpen;

    public static void main(String[] args) {
        BaskinRobbins myStore = new BaskinRobbins();
        myStore.location = "Milton";
        myStore.squareFeet = 600;
        myStore.isOpen = true;

        //System.out.println("My " + myStore.squareFeet + " square feet store is in " + myStore.location);
    }

    public BaskinRobbins(){
        IceCreamCone myCone = new IceCreamCone(); //declaring and construct
        myCone.flavor = "Vanilla";
        myCone.nScoops = 3;
        myCone.waffleCone = true;

        System.out.println();

        IceCreamCone myCone2 = new IceCreamCone();
        myCone2.flavor = "Strawberry";
        myCone2.nScoops = 2;
        myCone2.waffleCone = false;

        myCone.PrintInfo();
        System.out.println();
        myCone2.PrintInfo();

        Cake myCake = new Cake();
        myCake.flavor = "strawberry";
        myCake.diameter = 12;
        myCake.isIceCream = false;

        myCake.PrintInfo();
    }
}
