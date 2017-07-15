package iterator;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class OldClientApplication {
    public static void main(String[] args){
        NameList nameList = new NameList("Pawel", "Kasia", "Konrad", "Antoni");
        for (String name : nameList.getNames()){
            System.out.println(name);
        }
    }
}