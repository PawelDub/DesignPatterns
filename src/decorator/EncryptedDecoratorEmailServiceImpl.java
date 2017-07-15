package decorator;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class EncryptedDecoratorEmailServiceImpl implements EmailService {

    private EmailService emailaservice;

    public EncryptedDecoratorEmailServiceImpl(EmailService emailaservice) {
        this.emailaservice = emailaservice;
    }

    @Override
    public void sendEmail(String content) {
        System.out.println("=================== encrypted start=================" );
        emailaservice.sendEmail(content);
        System.out.println("=================== encrypted and ==================");
    }

    @Override
    public void deleteEmail() {
        emailaservice.deleteEmail();
    }
}
