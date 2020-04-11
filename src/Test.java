public class Test {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle();
        bicycle1.producer = "Scott";
        bicycle1.model = "Speedster";
        bicycle1.size = 52;

        Bicycle bicycle2 = new Bicycle();
        bicycle2.producer = "Merida";
        bicycle2.model = "Scultura";
        bicycle2.size = 49;

        System.out.println(bicycle1.producer + " " + bicycle1.model + ", rozmiar: " + bicycle1.size);
        System.out.println(bicycle2.producer + " " + bicycle2.model + ", rozmiar: " + bicycle2.size);
    }
}
