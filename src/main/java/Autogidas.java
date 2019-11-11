import java.util.ArrayList;
import java.util.List;

public class Autogidas {

    private String pavadinimas;
    private String miestas;
    private List<Automobilis> automobiliai= new ArrayList<>();



    public void ideti(Automobilis automobilis) throws PavadinimoFormatasException, MarkeNeleistina{
        if (automobilis.getMarke().length() > 15){
            throw new PavadinimoFormatasException("Pavadinimas per iklgas");
        }else{
            automobiliai.add(automobilis);

            automobiliai.add(automobilis);


        }

        if(automobilis.getMarke().equals("Opel"))
            throw new MarkeNeleistina("");


    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public String getMiestas() {
        return miestas;
    }

    public List<Automobilis> getAutomobiliai() {
        return automobiliai;
    }

    public Autogidas(String pavadinimas, String miestas) {
        this.pavadinimas = pavadinimas;
        this.miestas = miestas;
        this.automobiliai = automobiliai;
    }
}
