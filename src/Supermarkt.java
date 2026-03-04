import java.util.Scanner;

public class Supermarkt {
    //    - Private Product bread is een variable van de class Product.
//    - Dit is zeg maar een doosje waarbij je data van het type Product in op kan slaan.
//    - in dit geval heeft bread een name, price en amount.
//    - Omdat het private is kan je het niet direct aanroepen of wijzigen
//    - Dit kan alleen door het in een constructor of via getters en setters.
    private final Product bread;
    private final Product fruit;
    private Product toiletPaper;
    private final Product cheese;
    private Product milk;
    private final Product chocolate;

    // Hier zeg je eigenlijk als ik bij mijn parameter Product bread null invul. Dan geef je de waarden "fake", 0.0 en 0 aan mee.
//    Dit is een constructor met een if/else statement
    public Supermarkt(Product bread, Product fruit, Product chocolate, Product cheese) {
        if (bread == null){
            this.bread = new Product("fake", 0.0, 0);
        } else {
            this.bread = bread;
        } if (fruit == null){
            this.fruit = new Product("fake", 0.0, 0);
        } else{
            this.fruit = fruit;
        } if (toiletPaper == null){
            this.toiletPaper = new Product("fake", 0.0, 0);
        } else{
            this.toiletPaper = toiletPaper;
        } if (milk == null){
            this.milk = new Product("fake", 0.0, 0);
        } else{
            this.milk = milk;
        } if (cheese == null){
            this.cheese = new Product("fake", 0.0, 0);
        } else{
            this.cheese = cheese;
        } if (chocolate == null){
            this.chocolate = new Product("fake", 0.0, 0);
        } else {
            this.chocolate = chocolate;
        }
    }

    //    Dit is ook een constructor met if/else statement. Hier gebruik je overloading. De constructor heeft dezelfde naam Supermarkt maar het éénige verschil zijn het aantal parameters
    public Supermarkt(Product bread, Product fruit, Product toiletPaper, Product milk, Product cheese, Product chocolate) {
        if (bread == null){
            this.bread = new Product("fake", 0.0, 0);
        } else {
            this.bread = bread;
        } if (fruit == null){
            this.fruit = new Product("fake", 0.0, 0);
        } else{
            this.fruit = fruit;
        } if (toiletPaper == null){
            this.toiletPaper = new Product("fake", 0.0, 0);
        } else{
            this.toiletPaper = toiletPaper;
        } if (milk == null){
            this.milk = new Product("fake", 0.0, 0);
        } else{
            this.milk = milk;
        } if (cheese == null){
            this.cheese = new Product("fake", 0.0, 0);
        } else{
            this.cheese = cheese;
        } if (chocolate == null){
            this.chocolate = new Product("fake", 0.0, 0);
        } else {
            this.chocolate = chocolate;
        }
    }


    public void buyItem(Product product, int amount) {
        Scanner scanner = new Scanner(System.in);
        if (product.getAmount() >= amount) {
            System.out.println("You bought " + amount + " " + product.getName() + " for " + product.getPrice() * amount + " euro");
        } else {
            System.out.println("You cannot buy " + amount + " " + product.getName() + " we only have " + product.getAmount());
            System.out.println("Change your amount here: ");
            int newAmount = scanner.nextInt();
            buyItem(product, newAmount);
        }
    }


    public void buyBread (int amount){
        buyItem(this.bread, amount);
    }
    public void buyFruit ( int amount){
        buyItem(this.fruit, amount);
    }
    public void buyToiletPaper ( int amount){
        buyItem(this.toiletPaper, amount);
    }
    public void buyCheese( int amount){
        buyItem(this.cheese, amount);
    }
    public void buyMilk( int amount){
        buyItem(this.milk, amount);
    }
    public void buyChocolate( int amount){
        buyItem(this.chocolate, amount);
    }


    public Product getBread() {
        return bread;
    }

    public Product getFruit() {
        return fruit;
    }

    public Product getToiletPaper() {
        return toiletPaper;
    }

    public Product getCheese() {
        return cheese;
    }

    public Product getMilk() {
        return milk;
    }

    public Product getChocolate() {
        return chocolate;
    }



}
