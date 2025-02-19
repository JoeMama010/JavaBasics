public class Flugzeug implements FliegendesObjekt {
    private String modell;

    public Flugzeug(String modell) {
        this.modell = modell;
    }

    @Override
    public void fliegen() {
        System.out.println("Das Flugzeug" + modell + "fliegt.");
    }

    @Override // immer neu schreiebn das obere zählt nicht mehr
    public void herunterfallen() {
        System.out.println("Das Flugzeug" + modell + "herunterfallen.");
    }

    /*
    Weil FliegendesObjekt ein Interface ist muss Flugzeug(FliegendesObjekt implementiert) jede Methode die
    in FliegendesObjekt erstellt wurde auch in Flugzeug gemacht werden(mit @Override damit die Methode
    überschrieben wird)
     */


}

