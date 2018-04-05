package hashtable;

//item es mi bucket :v 
public class Map {
    private HashNode itemArray[]; //Arr
    private int numItems; //
    private int size; // count
    
    public Map() {
        numItems = 10;
        itemArray = new HashNode[numItems];
        size = 0;
        for(int i = 0; i < numItems; i++) {
            itemArray[i] = null;
        }
    }
    
    public int getSize() {
        return size;
    }
    
    public boolean isEmpty() {
        return getSize() == 0;
    }
    
    //esto implementa la hash function para conseguir un key
    public int getItemIndex(String key) {
        int hashCode = key.hashCode();
        int index = hashCode % numItems;
        return index;
    }
    
    public void add(String key, int value) {
        int index = getItemIndex(key);
        HashNode head = itemArray[index];
        
        //revisar si el key ya existe
        while(head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        
        //insertar el key en un chain
        size++;
        head = itemArray[index];
        HashNode nuevo = new HashNode(key, value);
        nuevo.next = head;
        itemArray[index] = nuevo;
    }
    
    public int get(String key) {
        //encontrar head del chain de la llave que se esta dando de parametro
        int index = getItemIndex(key);
        HashNode head = itemArray[index];
        
        //buscar un key en el chain
        while(head != null) {
            if(head.key.equals(key))
                return head.value;
            head = head.next;
        }
        //retornar nulo en caso que no se encuentre nada
        return 0;
    }
}
