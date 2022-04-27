package AnimalRescuer;

import AnimalRescuer.LivingBeings.Animal.Animal;
import AnimalRescuer.LivingBeings.Animal.Dog.Dog;
import AnimalRescuer.LivingBeings.Animal.Dog.GermanShepherd;
import AnimalRescuer.LivingBeings.Animal.Dog.GoldenRetriever;
import AnimalRescuer.LivingBeings.Animal.Dog.Labrador;
import AnimalRescuer.LivingBeings.Humans.Boy;
import AnimalRescuer.LivingBeings.Humans.Girl;
import AnimalRescuer.LivingBeings.Humans.Humans;
import AnimalRescuer.LivingBeings.Humans.Veterinarian;

public class AppMain {
    public static void main(String[] args) {
//        Dog constantin = new Dog();
//        Girl girl = new Girl();
//        PetFood dogFood = new PetFood();
//        Boy boy = new Boy();
//        Veterinarian dr = new Veterinarian();
//        AnimalActivity activity = new AnimalActivity();
//
//        Dog dog = new Dog();
//        dog.setName("Buburi");
//        dog.setAgeInMonths(32);
//        dog.setBreed("Dalmatian");
//        dog.setColor("White");
//        dog.setOwnerName("John");
//
//        Boy boy = new Boy();
//        boy.setName("James");
//        boy.setAgeInYears(9);
//        boy.setMoneyAvailable(72);
//
//        Girl girl = new Girl();
//        girl.setName("Elisabeth");
//        girl.setAgeInYears(7);
//        girl.setMoneyAvailable(23);
//
//        PetFood food = new PetFood();
//        food.setStock(56);
//        food.setBrand("WoofIt");
//        food.setQuantity(5);
//        food.setPrice(12.3);
//
//        Veterinarian vet = new Veterinarian();
//        vet.setName("Dr. Dre");
//        vet.setSpecialization("Canine & Feline");
//        vet.setPrice(120);
//
//
//        System.out.println(dog.getName() + " loves to " + activity.run + " in the park.");
//        System.out.println("A visit to " + vet.getName() + " specialized in " + vet.getSpecialization() + " costs " + vet.getPrice() + " Euro");
//        System.out.println(boy.getName() + " has " + boy.getMoneyAvailable() + " Euros available");
//        System.out.println(girl.getName() + " has " + girl.getMoneyAvailable() + " Euros available");
//        System.out.println(dog.getName() +"'s " + "age is: " + dog.getAgeInMonths() + " months");
//        System.out.println("One package of " + food.getBrand() + " containing " + food.getQuantity() + " kg " + "of dog food costs " + food.getPrice() + " Euros." + "\n" +
//                "We have in stock " + food.getStock() + " packages");

    Animal animal = new Animal();
    animal.speak();
    Dog dog = new Dog();
    dog.speak();
        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.speak();
        GoldenRetriever goldenRetriever = new GoldenRetriever();
        goldenRetriever.speak();
        Labrador labrador = new Labrador();
        labrador.speak();

    Humans humans = new Humans();
    humans.speak();
    Girl girl = new Girl();
    girl.speak();


    }
}
