package Q2;

/**
 * Estratégia Concreta: Lógica para perfil Agressivo.
 */
public class CalculoAgressivoStrategy implements CalculoRiscoStrategy {
    @Override
    public String calcularPerfil(double valorAplicado) {
        System.out.println(" > Calculando com ênfase em Renda Variável e derivativos...");
        if (valorAplicado < 1000) {
            System.out.println("   (Aviso: Baixo aporte para perfil agressivo)");
        }
        return "Agressivo";
    }
}