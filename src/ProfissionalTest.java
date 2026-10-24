import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test
    void exemploEstruturaAaa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(1.0);
        // Assert
        assertEquals(0.0, aulas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    @Test 
    void adicionarAulaAvulsaMaiorQueLimite() {
        // Arrange
        Personal personal = new Personal("Marcelo", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(31.0);
        // Assert
        assertEquals(0.0, aulas, 0.001);
    }
    @Test 
    void registrarPagamento() {
        // Arrange
        Personal personal = new Personal("Juliano", "P002");
        // Act — troque/complete conforme a classe escolhida
        personal.addAulaAvulsa(30);
        personal.registrarPagamento();
        // Assert
        assertEquals(5440.5, personal.ultimoPagamento, 0.001);
    }
}