import java.util.ArrayList;
import java.util.List;

public class Meta extends Objetivo {

    private List<Objetivo> meta;

    public Meta(String meta) {
        super(meta);
        this.meta = new ArrayList<Objetivo>();
    }


    public void addObjetivo(Objetivo meta) {
        this.meta.add(meta);
    }

    public String getObjetivo() {
        String saida = "";
        saida = "Objetivo: " + this.getDescricao() + "\n";
        for (Objetivo meta : meta) {
            saida += meta.getObjetivo();
        }
        return saida;
    }
}
