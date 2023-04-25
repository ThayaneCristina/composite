public class PlanejamentoEstrategico {

    private Objetivo escopo;

    public String getEscopo() {
        if (this.escopo == null) {
            throw new NullPointerException("Planejamento fora do escopo");
        }
        return this.escopo.getObjetivo();
    }

    public void setEscopo(Objetivo planejamento) {
        this.escopo = planejamento;
    }

}
