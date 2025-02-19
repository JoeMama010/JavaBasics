public class App {

    public static void main(String[] args) {

        // Methoden aufrufe
        CodeStruckturen test = new CodeStruckturen("Whileloop", 5, 3.14, true);
//        test.Ifelse();
//        test.whileloop();
//        test.forloop();
        Auto TUTU = new Auto();
        TUTU.fahren();
        TUTU.tanken();
        /*
        Die Fahren-Methode ist eine abstrakte Methode des Fahrzeugs, somit muss ich sie im Auto neu machen. Tanken
        ist jedoch eine ganz normale Methode in der abstrakten Klasse Fahrzeug, deswegen kann ich auch, ohne dass ich
        sie in Auto neu definieren durch eine Auto-Instanz aufrufen. Das ist, weil das Auto vonFahrzeug erbt.
         */
    }
}