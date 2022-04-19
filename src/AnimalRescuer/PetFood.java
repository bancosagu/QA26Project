package AnimalRescuer;

public class PetFood {
    private double price;
    private double quantity;
    private String brand;
    private int stock;

    public double getPrice(){return this.price; }
    public void setPrice(double price){this.price = price; }

    public double getQuantity() {return quantity; }
    public void setQuantity(double quantity){this.quantity = quantity; }

    public String getBrand(){return this.brand; }
    public void setBrand(String brand){this.brand = brand; }

    public int getStock(){return stock; }
    public void setStock(int stock){this.stock = stock; }
}
