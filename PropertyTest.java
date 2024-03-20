import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Escreva uma descrição da classe PropertyTest aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class PropertyTest
{
    @Test
    public void testConstructor() {
        // Dados da Tabela 1
        String description = "T3 Monte belo";
        double price = 150000.00;

        // Criando objeto property1 usando o construtor
        Property property1 = new Property(description, price);

        // Verificando se o objeto é criado com os valores fornecidos
        assertEquals(description, property1.getDescription());
        assertEquals(price, property1.getPrice(), 0.01); // Usando delta para comparar valores de ponto flutuante
    }
}
