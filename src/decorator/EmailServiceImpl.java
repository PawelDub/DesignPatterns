package decorator;

import composite.leaf.Employee;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class EmailServiceImpl implements EmailService {
    @Override
    public void sendEmail(String content) {
        System.out.println("content: " + content);
    }

    @Override
    public void deleteEmail() {

    }
}
