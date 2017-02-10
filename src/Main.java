
public class Main {
    public static void main(String[] args) {
        MyHashTable t = new MyHashTable(100);
        t.put ("table", "стол");
        String r = t.get("table");
        System.out.println(r);
    }
}
