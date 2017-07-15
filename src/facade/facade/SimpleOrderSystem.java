package facade.facade;

import facade.complexOrderSystem.InvoicingService;
import facade.complexOrderSystem.MailingService;
import facade.complexOrderSystem.WarehouseService;

public class SimpleOrderSystem {
    WarehouseService warehouseService = new WarehouseService();
    MailingService mailingService = new MailingService();
    InvoicingService invoicingService = new InvoicingService();

    public void placeOrder(String product) {
        if (warehouseService.isAvailable(product)) {
            warehouseService.updateWarehouseState(product);
            String invoice = invoicingService.generateInvoice();
            mailingService.sendConfirmation();
            mailingService.sendInvoice(invoice);
        }
    }
}
