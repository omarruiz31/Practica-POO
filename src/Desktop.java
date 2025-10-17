public class Desktop extends Computer {

    private double caseHeight;

    public Desktop(String model, String manufacturing, String operatingSistem, double caseHeight){
        super(model, manufacturing, operatingSistem);
        this.caseHeight = caseHeight;
    }
    
    public String getComputerType(){
        return "computadora de escritorio";
    }

    public int calculatePortabilityScore(){
        return (int) (5+ caseHeight/20);
    }
    
}
