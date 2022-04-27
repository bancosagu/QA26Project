package AnimalRescuer.LivingBeings.Animal;

import AnimalRescuer.LivingBeings.LivingBeings;

public class Animal extends LivingBeings {
    private String color;
    private int ageInMonths;
    private String ownerName;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAgeInMonths() {
        return ageInMonths;
    }

    public void setAgeInMonths(int ageInMonths) {
        this.ageInMonths = ageInMonths;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
