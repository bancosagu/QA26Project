package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog constantin = new Dog();
        Girl girl = new Girl();
        DogFood dogFood = new DogFood();



        System.out.println(girl.name + " have " + girl.moneyAvailable + " Euros available");
        System.out.println("Varsta catelului este: " + constantin.ageInMonths + " luni");
        System.out.println("One package of " + dogFood.brand + " containing " + dogFood.quantity + " kg " + "\n" +
                "of dog food costs " + dogFood.price + " Euros." + "\n" +
                "We have in stock " + dogFood.stock + " packages");
    }
}
