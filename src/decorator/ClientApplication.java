package decorator;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class ClientApplication {
    public static void main(String[] args) {
        EmailService emailService = new SigneDecoratorEmailServiceImp(new EncryptedDecoratorEmailServiceImpl(new EmailServiceImpl()));
        emailService.sendEmail("Witam na szkoleniu");
        emailService.sendEmail("Program szkolenia wyslemmy przed szkoleniem");
        emailService.sendEmail("Dziekujemy za udzia");
    }
}
