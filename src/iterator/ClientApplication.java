package iterator;

/**
 * Created by Pawel_D on 2017-07-01.
 */
public class ClientApplication {
    public static void main(String[] args){
        HasIterator nameList = new NameList("Paweł", "Maciek", "Kasia", "Antoni");
        NameListIterator listIterator = nameList.createIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }

}
