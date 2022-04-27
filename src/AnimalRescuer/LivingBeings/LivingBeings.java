package AnimalRescuer.LivingBeings;

public class LivingBeings {
    private String name;
    private boolean isMale;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void speak(){
        System.out.println("sound");
    }
}
