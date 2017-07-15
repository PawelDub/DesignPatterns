package proxy;

/**
 * Created by Pawel_D on 2017-07-11.
 */
public class LoginModule {
    private static String user;
//

    public static void login(String user) {
        LoginModule.user = user;
    }
    public static String getUser() {
        return user;
    }

    public static String getUserRole() {
        if(user.equals("Pawel")) {
            return "admin";
        } else {
            return "employee";
        }
    }

}
