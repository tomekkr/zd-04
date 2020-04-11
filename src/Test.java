public class Test {
    public static void main(String[] args) {
        Bicycle bicycle1 = new Bicycle("Scott", "Speedster", 52);
        Bicycle bicycle2 = new Bicycle("Merida", "Scultura", 49);

        System.out.println(bicycle1.producer + " " + bicycle1.model + ", rozmiar: " + bicycle1.size);
        System.out.println(bicycle2.producer + " " + bicycle2.model + ", rozmiar: " + bicycle2.size);
    }
}
