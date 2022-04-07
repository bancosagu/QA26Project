package AnimalRescuer;

public class Dog {
    private String color;
    private double weight;
    private int ageInMonths;
    private String ownerName;
    private String breed;
    private String name;
    private boolean isMale;

    public String getColor() {return this.color; }
    public void setColor(String color) {this.color = color; }

    public double getWeight() {return this.weight; }
    public void setWeight(double weight) {this.weight = weight; }

    public int getAgeInMonths() {return this.ageInMonths; }
    public void setAgeInMonths(int ageInMonths) {this.ageInMonths = ageInMonths;}

    public String getOwnerName() {return this.ownerName; }
    public void setOwnerName(String ownerName) {this.ownerName = ownerName; }

    public String getBreed() {return this.breed; }
    public void setBreed(String breed) {this.breed = breed; }

    public String getName() {return this.name; }
    public void setName(String name) {this.name = name; }

    public boolean isMale() {return this.isMale; }
    public void setMale(boolean isMale) {this.isMale = isMale; }




    public void eat(){
        System.out.println("Eating dog food");
    }

    public void sleep(){
        System.out.println("zzzZZZ");
    }

    public void run(){
        System.out.println("Fast");
    }

    public void play(){
        System.out.println("All day");

    }

}
