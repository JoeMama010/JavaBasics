import java.util.ArrayList;

public class CodeStruckturen {
    // Instanzvariablen
    private String name;
    private int a;
    private double pi;
    private boolean flag;

    // Klassenvariable
    private static int c = 5;

    // Konstruktor
    public CodeStruckturen(String name, int a, double pi, boolean flag) {
        this.name = name;
        this.a = a;
        this.pi = pi;
        this.flag = flag;
    }

    // DATENTYPEN
    // Primitiver Datentyp
    // Primitivdatentypen sind einfache Datentypen, die direkt im Speicher gespeichert werden.
    // int, char, boolean
    int zahl = 5; // Speichert direkt den Wert 5.
    char buchstabe = 'A'; // Speichert direkt das Zeichen 'A'.
    boolean istWahr = true; // Speichert direkt den Wert true.


    // Referenzdatentyp
    // Referenzdatentypen speichern nicht den Wert selbst, sondern die Adresse eines Objekts im Speicher.
    // String, Array, Benutzerdefinierte Klassen(Objekte/Instanzen)
    String text = "Hallo";// Speichert die Adresse des String-Objekts, das "Hallo" enthält.
    int[] zahlen = {1, 2, 3}; // Speichert die Adresse des Arrays im Speicher.
    // neue Instanz // Speichert die Adresse des Person-Objekts im Speicher.

    // CODE STRUKTUREN

    // Main Methode
    public static void main(String[] args) {
        // Nur da zum Anschauen Aufruf der Mehoden in der Main Methode bei App
    }

    // If Else
    public void Ifelse() {
        int temperatur = 15;

        if (temperatur > 25) {
            System.out.println("Es ist heiss");
        }else if (temperatur >= 15){
            System.out.println("Es ist mild");
        } else {
            System.out.println("Es ist kalt");
        }
    }

    // While Loop
    public void whileloop() {
        int liter = 0;

        while (liter++ < 10) {
            System.out.println(liter);
        }
    }

    // For Loop
    public void forloop() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Jippi");
        }
    }
    // Durch Collection/Liste durchgehen
    public void outprintlist() {
        ArrayList<String> lernende  = new ArrayList<>();
        lernende.add("Emin");
        lernende.add("Leart");
        lernende.add("Michel");
        lernende.add("Simon");
        lernende.add("Flavio");

        for (String lehrling : lernende) {
            System.out.println(lehrling);
        }
    }

    // Switch Case
    public void switchcase() {

        int tag = 3;
        switch (tag) {
            case 1: // Hinter case kommt Wert mit switch Variable verglichen werden soll
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default: // Ist nicht notwendig aber wenn kein Case zutrifft dann kommt default zum Einsatz
                System.out.println("Kein gültiger Tag");
                break;
        }

        String farbe = "Gelb";
        switch (farbe) {
            case "Blau":
                System.out.println("Es ist Blau");
                break;
            case "Rot":
                System.out.println("Es ist Rot");
                break;
            case "Gelb":
                System.out.println("Es ist Gelb");
                break;
            default:
                System.out.println("Kein gelb");
                break;
        }
    }

    // Try Catch
    public void trycatch() {
        int dividend = 10;
        int divisor = 0;

        try {
            int ergebnis = dividend / divisor;
            System.out.println("Das Ergebnis ist " + ergebnis);
        } catch (ArithmeticException e) { // <- Exception die geworfen wird wenn eine Division durch 0 stattfindet
            System.out.println("Fehler: Division druch Null ist nicht erlaubt");
            // Durch catch wird sie aufgefangen und dann wird die eigene Fehlermeldung ausgegeben
        }
    }

    // Getter und Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
