import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Autogidas autogidas = new Autogidas("BMW x5","Vilnius");

        String pavadinimai[] = {
                "Audi A6",
                "BMW x5",
                "Opel Inisgnia",
                "Opel Vectra",
                "Audi A3"

        };
        for (int i = 0; i <10 ; i++) {
            autogidas.ideti(new BMW(pavadinimai[new Random().nextInt(pavadinimai.length)], "X5", 500 + i));

        }




autogidas.ideti(new Automobilis("BMW","X5",500));

        System.out.println("Automobilis: "+autogidas.getPavadinimas());

for (Automobilis p: autogidas.getAutomobiliai()){

    System.out.println("Automobilis "+p.getMarke());

}






    }

}
