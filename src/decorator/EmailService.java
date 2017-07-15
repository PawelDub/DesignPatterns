package decorator;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public interface EmailService {
    void sendEmail(String content);

    void deleteEmail();
}
