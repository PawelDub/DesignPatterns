package builder;

/**
 * Created by Pawel_D on 2017-07-03.
 */
public class ClientApplication {
    public static void main(String[] args) {
        User newUser = User.getBuilder()
                .withFirstName("Adam")
                .withAge(55)
                .withLastName("Adamowicz")
                .build();
        System.out.println(newUser.toString());
    }
}