abstract class Fahrzeug {
    abstract void fahren(); //

    public void tanken() {
        System.out.println("Das Fahrzeug wird betankt.");
    }

    /*
    Von einer Abstrackten Klasse können keine Instanzen geamcht werden. Somit muss man erbende Klassen von
    Fahrzeug machen damit man dann eine Instanz machen kann
     */
}

/*
Wann nutzen wir Vererbung und wann eine Abstrakte Klasse?
Vererbung nutzen wir wenn wir Codezeilen sparen möchten und wenn wir eine Klasse einfach erweiter möchten. Abstrakte
Klasssen brauchen wir wenn koplexe Systeme vereinfachen wollen, relevante Details sichtbar zu machen, klare Schnittstellen
zu definieren und die Kapselung zu unterstüzen. Aufgrund von diesen Punkten wird die Flexibilität und Wertbarkeit des
Codes erhöht.
 */
