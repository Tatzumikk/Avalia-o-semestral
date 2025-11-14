package Q1;

public class RelatorioSemanalStrategy implements RelatorioStrategy {
    @Override
    public void gerar() {
        System.out.println("--- Relatório Semanal Consolidado ---");
        System.out.println("[Dados]: Consolidando dados dos últimos 7 dias...");
        System.out.println("[Formato]: Planilha Excel com gráficos");
        System.out.println("Relatório semanal gerado com sucesso.\n");
    }
}