package facade.complexOrderSystem;

/**
 * Created by Pawel_D on 2017-07-03.
 */
public class MailingService {
    public void sendConfirmation() {
        System.out.println("Wysyłam email z potwierdzeniem realizacji zamówienia");
    }

    public void sendInvoice(String invoice) {
        System.out.println("Wysyłam fakture: " + invoice);
    }
}