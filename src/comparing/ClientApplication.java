package comparing;

import java.util.*;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class ClientApplication {

    public static void main(String[] args) {
        List<Czlowiek> czlowieki = new ArrayList<>();
        czlowieki.add(new Czlowiek('M', "Pawel", "Dubaj", 28));
        czlowieki.add(new Czlowiek('M', "Julian", "Kulinski", 36));
        czlowieki.add(new Czlowiek('K', "Julia", "Kulinska", 14));
        czlowieki.add(new Czlowiek('K', "Julia", "Kulinska", 12));
        czlowieki.add(new Czlowiek('K', "Julia", "Kulinskie", 14));
        czlowieki.add(new Czlowiek('K', "Alicja", "Miklasz", 44));
        czlowieki.add(new Czlowiek('M', "Anatol", "Anatola", 16));
        czlowieki.add(new Czlowiek('M', "Anatol", "Anatolu", 22));
        czlowieki.add(new Czlowiek('M', "Anatol", "Amol", 25));
        czlowieki.add(new Czlowiek('M', "Anatol", "Amol", 24));
        czlowieki.add(new Czlowiek('K', "Kinga", "Miklasz", 49));

        System.out.println("nieposortowane");
        czlowieki.forEach(System.out::println);
        System.out.println("=====================");

        Collections.sort(czlowieki);
        System.out.println("posortowane po surname");
        czlowieki.forEach(System.out::println);
        System.out.println("=====================");

        Collections.sort(czlowieki, new KomparatorPlec());
        System.out.println("Posortowane po plci: ");
        czlowieki.forEach(System.out::println);
        System.out.println("=====================");

        System.out.println("Posortowane: ");
        Collections.sort(czlowieki);
        czlowieki.forEach(System.out::println);
        System.out.println("=====================");

        System.out.println("Posortowane W JAVA 8: po name nastepnie po surname i na końcu po age");
        czlowieki.stream().sorted(comparatorByName().thenComparing(comapratorBySurname())
                                                    .thenComparingInt(Czlowiek::getAge))
                .forEach(e -> System.out.println(e));

        System.out.println("Posortowane W JAVA 8: po name nastepnie po surname");
        czlowieki
                .stream()
                .sorted(Comparator.comparing(Czlowiek::getName)
                        .thenComparing(Czlowiek::getSurname)
                        .thenComparingInt(Czlowiek::getAge))
                .forEach(System.out::println);
    }

    public static Comparator<Czlowiek> comparatorByName() {
        return (name1, name2) -> name1.getName().compareTo(name2.getName());
    }

    public static Comparator<Czlowiek> comapratorBySurname() {
        return (surname1, surname2) -> surname1.getSurname().compareTo(surname2.getSurname());
    }

    private static class KomparatorPlec implements Comparator<Czlowiek> {
        @Override
        public int compare(Czlowiek o1, Czlowiek o2) {
            int plec = o1.getSex() - o2.getSex();
            return plec == 0 ? o1.compareTo(o2) : plec;
        }
    }

    private static class ComparatorName implements Comparator<Czlowiek> {
        @Override
        public int compare(Czlowiek o1, Czlowiek o2) {
            int name = o1.getName().compareTo(o2.getName());
            return name == 0 ? o1.compareTo(o2) : name;
        }
    }
}