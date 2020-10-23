import org.junit.Test;
import static org.junit.Assert.*;

public class VendingMachineTest {
    VendingMachine machine = new VendingMachine();

    @Test
    public void testInitialBalance(){
        // Initial balance should be 0
        machine = new VendingMachine();
        assertEquals(0, machine.getBalance());
    }

    @Test
    public void testInitialRevenue(){
        // Initial revenue should be 0
        machine = new VendingMachine();
        assertEquals(0, machine.getRevenue());
    }

    @Test
    public void testInsertCoins(){
        machine = new VendingMachine();
        // Insert coin, coins should increase
        machine.insertCoin();
        assertEquals(1, machine.getBalance());
    }

    @Test
    public void testRefund(){
        machine = new VendingMachine();
        machine.insertCoin();
        machine.insertCoin();
        // Insert 2 coins, therefore refund should be 2
        assertEquals(2, machine.refund());
    }

    @Test
    public void testVendFailure(){
        machine = new VendingMachine();
        // No coins, should fail
        assertFalse(machine.vendCandyBar());

        // Purchase all the stock
        int price = 3;
        int capacity = 20;

        for(int cap=0; cap<capacity; cap++){
            for(int coin=0; coin<price; coin++){
                machine.insertCoin();
            }
            machine.vendCandyBar();
        }

        // should return false as stock is 0
        assertFalse(machine.vendCandyBar());
    }

    @Test
    public void testVendSuccess(){
        // Insert enough coins
        machine = new VendingMachine();
        int price = 3;

        for(int i=0; i<price; i++){ machine.insertCoin(); }

        // Check that it vends
        assertTrue(machine.vendCandyBar());
        // Check that balance changes correctly
        assertEquals(0, machine.getBalance());
        // Check that revenue increases
        assertEquals(3, machine.getRevenue());


        // Insert too many coins
        machine = new VendingMachine();

        price = 3;

        for(int i=0; i<price+1; i++){ machine.insertCoin(); }

        // Check that it vends
        assertTrue(machine.vendCandyBar());
        // Check that balance changes correctly
        assertEquals(1, machine.getBalance());
        // Check that revenue increases
        assertEquals(3, machine.getRevenue());
    }
}
