package hashtable;

public class HashNode {
    public String key;
    public int value;
    
    //apuntador al siguiente
    public HashNode next;
    
    public HashNode(String key, int value) {
        this.key = key;
        this.value = value;
    }
}