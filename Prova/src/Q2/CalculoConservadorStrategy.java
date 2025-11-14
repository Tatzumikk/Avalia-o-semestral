package Q2;

/**
 * Estratégia Concreta: Lógica para perfil Conservador.
 */
public class CalculoConservadorStrategy implements CalculoRiscoStrategy {
    @Override
    public String calcularPerfil(double valorAplicado) {
        System.out.println(" > Calculando com ênfase em Renda Fixa e baixa volatilidade...");
        return "Conservador";
    }
}
