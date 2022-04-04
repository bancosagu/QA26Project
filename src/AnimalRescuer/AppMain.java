package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog constantin = new Dog();
        Girl girl = new Girl();
        DogFood dogFood = new DogFood();
        Boy boy = new Boy();
        Veterinarian dr = new Veterinarian();
        AnimalActivity activity = new AnimalActivity();

        System.out.println(constantin.name + " loves to " + activity.run + " in the park.");
        System.out.println("A visit to " + dr.name + " specialized in " + dr.specialization + " costs " + dr.price + " Euro");
        System.out.println(boy.name + " has " + boy.moneyAvailable + " Euros available");
        System.out.println(girl.name + " has " + girl.moneyAvailable + " Euros available");
        System.out.println(constantin.name +"'s " + "age is: " + constantin.ageInMonths + " months");
        System.out.println("One package of " + dogFood.brand + " containing " + dogFood.quantity + " kg " + "of dog food costs " + dogFood.price + " Euros." + "\n" +
                "We have in stock " + dogFood.stock + " packages");



    }
}
