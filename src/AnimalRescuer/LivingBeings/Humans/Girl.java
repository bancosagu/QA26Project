package AnimalRescuer.LivingBeings.Humans;

public class Girl extends Humans{

    private double moneyAvailable;


    public double getMoneyAvailable(){return this.moneyAvailable; }
    public void setMoneyAvailable(double moneyAvailable){this.moneyAvailable = moneyAvailable; }

    @Override
    public void speak() {
        System.out.println("I'm a little girl.");
    }
}
