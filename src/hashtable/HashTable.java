package hashtable;

public class HashTable {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Map map = new Map();
        map.add("hello", 2);
        map.add("lol", 4);
        System.out.println(map.get("lol"));
    }
}