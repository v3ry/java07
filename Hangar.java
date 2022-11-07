package Vehicle;

public class Hangar {
    public static void main(String[] args) {
        
        Car mavoiture = new Car("Citroen", 92000);
        Boat monBateau = new Boat("Orbor",500);
        System.out.println(mavoiture.doStuff());
        System.out.println(monBateau.doStuff());
    }
}
