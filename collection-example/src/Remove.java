import java.util.LinkedList;

public class Remove {
    public static void main(String[] args) {
        LinkedList<String> Languages = new LinkedList<>();
        Languages.add("Java");
        Languages.add("Python");
        Languages.add("Html");
        Languages.add("linux");

        System.out.println("LinkedList" + Languages);

        String str =Languages.remove(2);

        System.out.println("Remove element :" + str);

        System.out.println("Update LinkedList : " + Languages);

    }
}
