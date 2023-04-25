public abstract class Objetivo {

    private String descricao;

    public Objetivo(String objetivo) {
        this.descricao = objetivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String objetivo) {
        this.descricao = objetivo;
    }

    public abstract String getObjetivo();
}
