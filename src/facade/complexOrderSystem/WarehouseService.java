package facade.complexOrderSystem;

public class WarehouseService {

    public boolean isAvailable(String product) {
        boolean available = product.equals("CD");
        System.out.println("Product is " + (available ? "available" : " not available"));
        return available;
    }

    public void updateWarehouseState(String product) {
        System.out.println("Aktualizuje stan magazynu");
    }
}
