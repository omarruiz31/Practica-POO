public final class Notebook extends Laptop {

    public Notebook(String model, String manufacturing, String operatingSistem ){
        super(model, manufacturing, operatingSistem);
    }

    public String getComputerType(){
        return "Computadora-laptop: NOTEBOOK";
    }

    public int calculatePortabilityScore(){
        return 1;
    }

     


    
    
    
}
