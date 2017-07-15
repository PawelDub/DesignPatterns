package comparing;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class Czlowiek implements Comparable<Czlowiek> {
    private char sex;
    private String name;
    private String surname;
    private int age;

    public Czlowiek() {
    }

    public Czlowiek(char plec, String name, String surname, int age) {
        this.sex = plec;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return sex + ", " + name + ", " + surname + ", " + age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Czlowiek o) {
        int porownaneNazwiska = surname.compareTo(o.surname);

        if(porownaneNazwiska == 0) {
            return name.compareTo(o.name);
        }
        else {
            return porownaneNazwiska;
        }
    }
}