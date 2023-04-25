public class Tarefa extends Objetivo{

    private String tarefa;

    public Tarefa(String meta, String tarefa) {
        super(meta);
        this.tarefa = tarefa;
    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public String getObjetivo() {
        return "Meta: " + this.getDescricao() + " - Tarefa: " + this.tarefa + "\n";
    }
}
