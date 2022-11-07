package Vehicle;

public class Boat extends Vehicle{
    
    public Boat(String brand, int km) {
        super(brand, km);
        //TODO Auto-generated constructor stub
    }

    @Override  
    public String doStuff() {  
        return "Je suis " + getBrand() + " et je fais glou glou !";
    }
}
