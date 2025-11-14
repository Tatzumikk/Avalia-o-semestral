package Q1;

import java.time.LocalDate;

/**
 * Estratégia Concreta: Gera relatórios diários.
 */
public class RelatorioDiarioStrategy implements RelatorioStrategy {
    @Override
    public void gerar() {
        System.out.println("--- Relatório Diário (" + LocalDate.now() + ") ---");
        System.out.println("[Dados]: Buscando métricas operacionais das últimas 24h...");
        System.out.println("[Formato]: PDF Simples");
        System.out.println("Relatório diário gerado com sucesso.\n");
    }
}
