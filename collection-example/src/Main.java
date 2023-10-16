import  java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("Linux");
        System.out.println("Linked-list:" + languages);
        String str = languages.get(2);
        System.out.println("Element at index 2:" + str);
    }
}
