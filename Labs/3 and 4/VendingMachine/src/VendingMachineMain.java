public class VendingMachineMain {

    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine = new VendingMachine();
        // Initial balance
        System.out.println("Testing initial balance.\nExpected: 0");
        System.out.println("Given: " + machine.getBalance());

        machine = new VendingMachine();
        // Initial revenue
        System.out.println("Testing initial revenue.\nExpected: 0");
        System.out.println("Given: " + machine.getRevenue());

        machine = new VendingMachine();
        // Testing coin insert
        System.out.println("Testing balance after coin insert.\nExpected: 1");
        machine.insertCoin();
        System.out.println("Given: " + machine.getBalance());

        machine = new VendingMachine();
        machine.insertCoin();
        // Testing refund
        System.out.println("Testing refund. Expecting 1 to be returned.");
        System.out.println("Returned: " + machine.refund());

        machine = new VendingMachine();
        // Testing vend fail
        System.out.println("Testing the fail cases for the vend.");
        System.out.println("Everything should return false.");
        System.out.println("No balance returns: " + machine.vendCandyBar());

        int price = 3;
        int capacity = 20;

        for(int cap=0; cap<capacity; cap++){
            for(int coin=0; coin<price; coin++){
                machine.insertCoin();
            }
            machine.vendCandyBar();
        }

        System.out.println("After clearing out the stock, returns: " + machine.vendCandyBar());

        machine = new VendingMachine();
        // Testing vend success
        System.out.println("Testing vend success.");
        System.out.println("Everything should return true.");

        price = 3;

        for(int i=0; i<price; i++){ machine.insertCoin(); }

        System.out.println("Exact amount inserted returns: " + machine.vendCandyBar());
        System.out.println("Balance check (expecting 0): " + machine.getBalance());
        System.out.println("Revenue check (expecting 3): " + machine.getRevenue());

        for(int i=0; i<price+1; i++){ machine.insertCoin(); }

        System.out.println("Too much inserted returns: " + machine.vendCandyBar());
        System.out.println("Balance check (expecting 1): " + machine.getBalance());
        System.out.println("Revenue check (expecting 6): " + machine.getRevenue());

    }
}
