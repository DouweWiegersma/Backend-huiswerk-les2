public class Product {
    //    hier zie je de variabelen van het product
//    ze zijn nu nog leeg!
    private final String name;
    private double price;
    private int amount;

    //    Vervolgens worden ze in een constructor gezet.
//    Hierdoor kan je data opslaan in deze variablen als je een object Product maakt.
    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return " || " + name + " || ";
    }
}

