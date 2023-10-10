package comunicacion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Alfabeto extends Pictograma{

    private String interpretacion;
    private String[] letras;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
        this.letras = letras;
    }

    public int cantidadLetras(){
        return letras.length;
    }

    public String interpretacion(){
        return interpretacion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    @Override
    public String toString() {
        return Arrays.stream(letras).map(String::toString).collect(Collectors.joining(", "));
    }
}
