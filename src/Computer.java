public abstract class Computer {
    private String model;
    private String manufacturing;
    private String operatingSistem;

    public Computer(String model, String manufacturing,String operatingSistem){
        this.model = model;
        this.manufacturing = manufacturing;
        this.operatingSistem = operatingSistem;
    }

    //Getters
    public String getModel(){
        return model;
    }
    public abstract String getComputerType();

    public abstract int calculatePortabilityScore();


}
