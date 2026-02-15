public class Customer {
    // Hier maak ik twee variabelen deze twee zijn gewoon leeg/null
    private final String name;
    private Supermarkt supermarkt;

    //    Hier maak ik een constructor waarbij ik de name variabel ga vullen met data. this.name verwijst naar private final String name;.
//    Wanneer ik nu een object aan maak met de Customer constructor zal data moeten meegeven met het type String.
//    Deze String die ik heb bedacht wordt dan vervolgens opgeslagen in mijn private finale String name;
    public Customer(String name) {
        this.name = name;
    }

    //    Deze functie zorgt ervoor dat mijn variabel supermarkt wordt ingevuld door middel van een parameter.
    public void goToSupermarket(Supermarkt supermarkt){
        this.supermarkt = supermarkt;
    }

    public Supermarkt getSupermarkt() {
        return supermarkt;
    }

    public String getName() {
        return name;
    }

    //    Doordat ik zo net door de functie goToSupermarket() functie een supermarkt heb toegewezen aan mijn private Supermarkt supermarkt;. Weet deze methode welke supermarkt het is. Hier staat dus eigenlijk: spar.getCheese().getName().equals(productName) of jumbo.getCheese().getName().equals(productName).
//    Om de naam van de cheese te krijgen kan je niet jumbo.getCheese() doen.
//    Omdat dit een object geeft met data over (name, price en amount) zie Product class!
//    omdat deze variabelen in Private staan moet je dus door middel van een getter: getName() de naam van de kaas ophalen.
//    En als je bijvoorbeeld de price wilt hebben moet je jumbo.getCheese().getPrice() doen.
//    vervolgens wordt hier gechecked of dit product in de winkel is door de .equals() methode.
//    Deze methode vergelijkt de parameter met naam die jouw cheese object hebt gegeven.
//    In mijn geval gauda wordt vergeleken met de input van de parameter.
//    Als dit overeenkomt wordt de methode buyCheese(amount) aangeroepen.
    public void buyItem(String productName, int amount) {
        if(this.supermarkt == null){
            System.out.println("Select a supermarket first!");
        } else if (supermarkt.getCheese().getName().equals(productName)) {
            supermarkt.buyCheese(amount);
        } else if (supermarkt.getBread().getName().equals(productName)) {
            supermarkt.buyBread(amount);
        } else if (supermarkt.getFruit().getName().equals(productName)) {
            supermarkt.buyFruit(amount);
        } else if (supermarkt.getMilk().getName().equals(productName)) {
            supermarkt.buyMilk(amount);
        } else if (supermarkt.getChocolate().getName().equals(productName)) {
            supermarkt.buyChocolate(amount);
        } else if (supermarkt.getToiletPaper().getName().equals(productName)) {
            supermarkt.buyToiletPaper(amount);
        }else {
            System.out.println("This product isn't in the supermarket!");
        }
    }
}
