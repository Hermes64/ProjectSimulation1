package KEA;

public class ProjectParentClass {

    private String name ;
    private int iteration;
    private int initalInput;
    private double bigOutputFactor = 0.8;
    private double littleOutputFactor = 0.2;


    public ProjectParentClass(String name, int iteration, int initalInput, double bigOutputFactor, double littleOutputFactor) {
        this.name = name;
        this.iteration = iteration;
        this.bigOutputFactor = bigOutputFactor;
        this.littleOutputFactor = littleOutputFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIteration() {
        return iteration;
    }

    public void setIteration(int iteration) {
        this.iteration = iteration;
    }

    public int getInitalInput() {
        return initalInput;
    }

    public void setInitalInput(int initalInput) {
        this.initalInput = initalInput;
    }

    public double getBigOutputFactor() {
        return bigOutputFactor;
    }

    public void setBigOutputFactor(double bigOutputFactor) {
        this.bigOutputFactor = bigOutputFactor;
    }

    public double getLittleOutputFactor() {
        return littleOutputFactor;
    }

    public void setLittleOutputFactor(double littleOutputFactor) {
        this.littleOutputFactor = littleOutputFactor;
    }

    double calculateInput(double input, double bigOutput ){
        double newInput = input * bigOutput;

     return newInput;
    }


}
