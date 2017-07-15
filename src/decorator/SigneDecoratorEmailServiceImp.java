package decorator;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class SigneDecoratorEmailServiceImp implements EmailService {
    private EmailService emailService;

    public SigneDecoratorEmailServiceImp(EmailService emailService) {
        this.emailService = emailService;
    }

    @Override
    public void sendEmail(String content) {
        System.out.println("Dzien Dobry");
        emailService.sendEmail(content);
        System.out.println("Michal Adamski");
    }

    @Override
    public void deleteEmail() {
        emailService.deleteEmail();
    }
}
