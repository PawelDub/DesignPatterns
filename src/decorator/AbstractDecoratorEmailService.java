package decorator;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class AbstractDecoratorEmailService implements EmailService {
    EmailService emailService;

    public AbstractDecoratorEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void sendEmail(String content) {
        emailService.sendEmail(content);
    }

    @Override
    public void deleteEmail() {
        emailService.deleteEmail();
    }
}
