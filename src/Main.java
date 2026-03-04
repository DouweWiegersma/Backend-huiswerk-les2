import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        Let niet op de comments dit zijn gewoon aantekeningen voor mezelf.
        Scanner scanner = new Scanner(System.in);

//              Hier maak je een object aan genaamd bread met het type Product.
        Product bread = new Product("wheat bread", 3.0, 20);

        Product fruit = new Product("apple", 3.00, 20);
        Product toiletPaper = new Product("toiletpaper", 4.00, 30);
        Product cheese = new Product("gauda", 5.00, 40);
        Product milk = new Product("organic milk", 2.00, 50);
        Product chocolate = new Product("white chocolate", 1.00, 5);

//               Hier maak je een object aan met het type Supermarkt en de naam jumbo.
//               Je hebt nu toegang tot alle variabelen die in de Supermarkt class staan.
//               Private Product fruit of Private Product bread bijvoorbeeld.
//               Deze variabelen zijn nog leeg omdat je ze nog niet hebt toegewezen.
//               De constructor die ik heb gemaakt ontvangt alleen Product type variabelen.
//               Dit betekent dat ik alleen variabelen kan toewijzen aan dit object met het type Product.
//               Ik heb hier boven 5 Product variabelen gemaakt genaamd fruit, toiletPaper, cheese, milk chocolate
//               Deze 5 variabelen kan ik toewijzen aan mijn variabelen die in de Supermarkt class staan
//               bijvoorbeeld private Product toiletPaper.
//               De constructor bepaald hoeveel data/variabelen ik kan opslaan.
//               Maak ik een Supermarkt constructor met 4 variabelen zoals hier onder kan ik er maar 4 Producten in opslaan.
//               Maak ik een constructor met 6 variabelen kan ik dus 6 producten in dit object opslaan.
        Supermarkt jumbo = new Supermarkt(bread, fruit, chocolate, cheese);

        Supermarkt ah = new Supermarkt(null, null, chocolate, cheese);
        Supermarkt spar = new Supermarkt(bread, fruit, toiletPaper, milk, cheese, chocolate);


        System.out.println("What's your name?");
        String name = scanner.nextLine();
        Customer customer = new Customer(name);
        System.out.println("Which supermarket would you like to order from?");
        System.out.println("choices: || Spar || Ah || Jumbo ||");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("spar")) {
            customer.goToSupermarket(spar);
        } else if (choice.equalsIgnoreCase("jumbo")) {
            customer.goToSupermarket(jumbo);
        } else if (choice.equalsIgnoreCase("ah")) {
            customer.goToSupermarket(ah);
        } else {
            System.out.println("This shop doesn't exist");
            System.out.println("Try again: ");
            String change = scanner.nextLine();
            if (change.equalsIgnoreCase("spar")) {
                customer.goToSupermarket(spar);
            } else if (change.equalsIgnoreCase("ah")) {
                customer.goToSupermarket(ah);
            } else {
                customer.goToSupermarket(jumbo);
            }
        }
        System.out.println("Which product do you want to buy " + customer.getName() + "?");
        if (customer.getSupermarkt() == jumbo) {
            System.out.println(jumbo.getBread() + " " + jumbo.getChocolate() + " " + jumbo.getFruit() + " " + jumbo.getCheese());
        } else if (customer.getSupermarkt() == ah) {
            System.out.println(ah.getBread() + " " + ah.getChocolate() + ah.getFruit() + ah.getCheese());
        } else {
            System.out.println(spar.getToiletPaper() + " " + spar.getMilk() + " " + spar.getFruit() + " " + spar.getBread() + " " + spar.getChocolate() + " " + spar.getCheese());
        }
        String productName = scanner.nextLine();
        System.out.println("How many you want to buy?");
        int amount = scanner.nextInt();
        customer.buyItem(productName, amount);
        scanner.close();
    }
}

