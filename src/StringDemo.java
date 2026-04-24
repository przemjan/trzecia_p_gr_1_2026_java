public class StringDemo {
    public static void main(String[] args) {
        String name = "Bożydar";

        int dlugosc = name.length();

        char inicjal = name.charAt(2);
        System.out.println("Inicjał: " + inicjal);

        String duze, male;

        duze = name.toUpperCase();
        male = name.toLowerCase();

        //komentarz

        System.out.println("Imię: " + name);

    }
}
