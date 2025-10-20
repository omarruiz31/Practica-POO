public abstract class Computer {
    private String model;
    private String manufacturing;
    private String operatingSistem;

    public Computer(String model, String manufacturing,String operatingSistem){
        this.model = model;
        this.manufacturing = manufacturing;
        this.operatingSistem = operatingSistem;
    }


    public abstract String getComputerType();

    public abstract int calculatePortabilityScore();

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getManufacturing(){
        return manufacturing;
    }
    public void setManufacturing(String manufacturing){
        this.manufacturing = manufacturing;
    }

    public String getOperatingSistem(){
        return operatingSistem;
    }
    public void setOperatingSistem(String operatingSistem){
        this.operatingSistem = operatingSistem;
    }

    @Override
    public String toString(){
        return  model + " " + manufacturing + " " + operatingSistem + " " + getComputerType();
    }


}
