import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Autogidas autogidas = new Autogidas("BMW x5","Vilnius");

        String pavadinimai[] = {
                "Audi A6",
                "BMW x5",
                "Opel5555555555555555555555555hhhhhhhhhhhhhhhh",
                "Opel Vectra",
                "Audi A3 "

        };


        for (int i = 0; i <10 ; i++) {
            try {
                autogidas.ideti(new BMW(pavadinimai[new Random().nextInt(pavadinimai.length)], "X5", 500 + i));
            } catch (PavadinimoFormatasException e) {

                System.out.println("Skelbimas neįdetas nes pavadinimas perilgas!!!");
                //e.printStackTrace();
            }

        }





        System.out.println("Automobilis: "+autogidas.getPavadinimas());

for (Automobilis p: autogidas.getAutomobiliai()){

    System.out.println("Automobilis "+p.getMarke()+" Modelis "+p.getModelis()+" Kaina: "+p.getKaina());


}






    }

}
