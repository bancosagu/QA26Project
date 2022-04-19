package AnimalRescuer.LivingBeings.Humans;

public class Veterinarian extends Humans {

    private String specialization;
    private double price;


    public String getSpecialization(){return this.specialization; }
    public void setSpecialization(String specialization){this.specialization = specialization; }

    public double getPrice(){return this.price; }
    public void setPrice(double price){this.price = price; }

}
