

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
    private User clientNull;
    private User seller1;
    private User seller2;
    private Sell sell1;
    private Sell sellNull;
    private Company company;
    private Property property1;
    private Property propertyNull;
    

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        clientNull = null;
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        propertyNull = null;
        sellNull = null;
        
        String description = "T3 Monte belo";
        double price = 150000.00;
        property1 = new Property(description, price);
        
        sell1 = new Sell(client1, seller1, property1);
        
        company = new Company();

    }

    @Test
    public void testConstrutor()
    {
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
        assertNotNull(company.getSells());
        assertNotNull(company.getProperties());
    }
    
    @Test
    public void testRegisterClients()
    {
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));

    }
    
    @Test
    public void testRegisterClient()
    {
        assertTrue(company.registerClient(client1));
        
            }
    
    @Test
    public void testRegisterClientDuplicate()
    {
        assertTrue(company.registerClient(client1));
        assertFalse(company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientNull()
    {
        assertFalse(company.registerClient(clientNull));
    }
    
    @Test
    public void testRegisterProperty()
    {
        assertTrue(company.registerProperty(property1));
        
            }
    
    @Test
    public void testRegisterPropertyDuplicate()
    {
        assertTrue(company.registerProperty(property1));
        assertFalse(company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterPropertyNull()
    {
        assertFalse(company.registerProperty(propertyNull));
    }
    
    @Test
    public void testRegistersell()
    {
        assertTrue(company.registerSell(sell1));
        
            }
    
    @Test
    public void testRegisterSellDuplicate()
    {
        assertTrue(company.registerSell(sell1));
        assertFalse(company.registerSell(sell1));
    }
    
    @Test
    public void testRegisterSellNull()
    {
        assertFalse(company.registerSell(sellNull));
    }

}
