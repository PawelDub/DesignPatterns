package decorator;

import java.util.Comparator;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class ColoredDecoratorEmailServiceImpl extends AbstractDecoratorEmailService {

    public ColoredDecoratorEmailServiceImpl(EmailService emailService) {
        super(emailService);
    }

    public void sendEmail(String content) {
        System.out.println("Koloruje");
        emailService.sendEmail(content);
    }
}
