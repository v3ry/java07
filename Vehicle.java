package Vehicle;


public abstract class Vehicle {
    String brand = "";
    int kilometers = 0;

    public Vehicle(String brand,int km) {
        this.brand = brand;
        this.kilometers = km;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setKilometers(int km) {
        this.kilometers = km;
    }

    public abstract String doStuff();
}
