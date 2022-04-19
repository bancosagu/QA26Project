package AnimalRescuer.LivingBeings.Humans;

import AnimalRescuer.LivingBeings.LivingBeings;

public class Humans extends LivingBeings {

    private int ageInYears;
    private String nationality;
    private boolean isAdult;


    public int getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(int ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }
}
