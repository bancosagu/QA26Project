package AnimalRescuer;

public class AppMain {
    public static void main(String[] args) {
        Dog constantin = new Dog();
        Girl girl = new Girl();
        DogFood dogFood = new DogFood();
        Boy boy = new Boy();





        System.out.println(boy.name + " have " + boy.moneyAvailable + " Euros available");
        System.out.println(girl.name + " have " + girl.moneyAvailable + " Euros available");
        System.out.println(constantin.name +"'s " + "age is: " + constantin.ageInMonths + " months");
        System.out.println("One package of " + dogFood.brand + " containing " + dogFood.quantity + " kg " + "\n" +
                "of dog food costs " + dogFood.price + " Euros." + "\n" +
                "We have in stock " + dogFood.stock + " packages");



    }
}
