public class Laptop extends Computer implements PortableDevice {

    private int batteryCappacity;
    private double weight;

    public Laptop(String model, String manufacturing, String operatingSistem, int batteryCappacity, double weight){
        super(model, manufacturing, operatingSistem);
        this.batteryCappacity = batteryCappacity;
        this.weight = weight;
    }
    public Laptop(String model, String manufacturing, String operatingSistem){
        super(model, manufacturing, operatingSistem);
    }

    public int getBatteryCapacitty(){
        return batteryCappacity;
    }

    public String getComputerType(){
        return "Computadora Portatil";
    }

    public int calculatePortabilityScore(){
        return (int) weight;
    }





    
}
