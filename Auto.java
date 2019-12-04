class Auto{
    String farbe;
    int reifen;
    String marke;
    int baujahr;
    int plaetze;

    public Auto(String color, String marke, int plaetze, int baujahr){
        this.farbe = color;
        this.marke = marke;
        this.baujahr = baujahr;
        this.plaetze = plaetze;
    }

    public Auto(String color, String marke){
        this.farbe = color;
        this.marke = marke;
    }

    public void accelerate(){
        System.out.println("Vroooom");
    }

    public void brake(){

    }

    public void paint(String newcolor){
        this.farbe = newcolor;
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Rot","mercedes",5,2017);
        System.out.println(auto1.farbe+ " " + auto1.marke + " " + auto1.plaetze + " " + auto1.baujahr);
        Auto auto2 = new Auto("Grün","BMW");
        System.out.println(auto1.farbe);
        auto1.paint("Yellow");
        System.out.println(auto1.farbe);

    }
}
