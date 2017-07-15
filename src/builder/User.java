package builder;

/**
 * Created by Pawel_D on 2017-07-03.
 */
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private String email;
    private char sex;
    private String role;
    private int haight;
    private String nickname;

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", sex=" + sex +
                ", role='" + role + '\'' +
                ", haight=" + haight +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public static Builder getBuilder() {
        return new User().new Builder();
    }

    public class Builder extends User {
        private String firstName;
        private String lastName;
        private int age;
        private int weight;
        private String email;
        private char sex;
        private String role;
        private int haight;
        private String nickname;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age) {
            this.age = age;
            return this;
        }

        public Builder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withSex(char sex) {
            this.sex = sex;
            return this;
        }

        public Builder withRole(String role) {
            this.role = role;
            return this;
        }

        public Builder withHaight(int haight) {
            this.haight = haight;
            return this;
        }

        public Builder withNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public User build() {
            User user = new User();
            user.sex = this.sex;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            user.role = this.role;
            user.weight = this.weight;
            user.email = this.email;
            user.age = this.age;
            user.haight = this.haight;
            user.nickname = this.nickname;
            return user;
        }
    }
}
