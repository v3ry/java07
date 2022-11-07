package Vehicle;

public class Car extends Vehicle{

    public Car(String brand, int km) {
        super(brand, km);
        //TODO Auto-generated constructor stub
    }
    
    @Override  
    public String doStuff() {  
        return "Je suis " + getBrand() + " et je fais vroom vroom !";
    }
}
