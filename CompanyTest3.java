

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste CompanyTest3.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class CompanyTest3
{
    private User client1;
    private User client2;
    private User seller1;
    private User seller2;
    private Company company;
    private Property property1;
    

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        User client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        User client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        User seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        User seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        
        company = new Company();
        
        company.registerClient(client1);
        company.registerClient(client2);
        company.registerSeller(seller1);
        company.registerSeller(seller2);

    }

    @Test
    public void testConstrutor()
    {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getSells());
        assertNotNull(company.getProperties());
    }

}
