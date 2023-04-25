import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class PlanejamentoEstrategicoTest {

    @Test
    void deveRetornarmetaPlanejamentoEstrategico() {

        Meta meta1 = new Meta("Aumentar vendas da empresa");

        Meta meta3 = new Meta("Tornar a empresa mais conhecida no mercado");
        Tarefa tarefa4 = new Tarefa("Investir em marketing", "Criar vídeo de propaganda");
        meta3.addObjetivo(tarefa4);

        Meta meta2 = new Meta("Triplicar o faturamento dos próximos cinco anos");
        Tarefa tarefa1 = new Tarefa("Ampliar o mix de produtos", "Contratar pesquisa de Mix" +
                " de produtos");
        Tarefa tarefa2 = new Tarefa("Ampliar o mix de produtos", "Incluir no mix produtos apontados" +
                " pela pesquisa");
        meta2.addObjetivo(tarefa1);
        meta2.addObjetivo(tarefa2);

        Meta escopo = new Meta("Planejamento Estratégico");
        escopo.addObjetivo(meta1);
        escopo.addObjetivo(meta3);
        escopo.addObjetivo(meta2);

        PlanejamentoEstrategico planejamentoEstrategico = new PlanejamentoEstrategico();
        planejamentoEstrategico.setEscopo(escopo);

        assertEquals("Objetivo: Planejamento Estratégico\n" +
                "Objetivo: Aumentar vendas da empresa\n" +
                "Objetivo: Tornar a empresa mais conhecida no mercado\n" +
                "Meta: Investir em marketing - Tarefa: Criar vídeo de propaganda\n" +
                "Objetivo: Triplicar o faturamento dos próximos cinco anos\n" +
                "Meta: Ampliar o mix de produtos - Tarefa: Contratar pesquisa de Mix de produtos\n" +
                "Meta: Ampliar o mix de produtos - Tarefa: Incluir no mix produtos apontados pela pesquisa\n",
                planejamentoEstrategico.getEscopo());
    }

    @Test
    void deveRetornarExecacaoPlanejamentoSemEscopo() {
        try {
            PlanejamentoEstrategico planejamentoEstrategico = new PlanejamentoEstrategico();
            planejamentoEstrategico.getEscopo();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Planejamento fora do escopo", e.getMessage());
        }
    }
}
