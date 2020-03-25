public class IntArray {
    int intArray[];
    int capacity;
    int numElems;

    public IntArray() {
        intArray = new int[10];
    }

    public IntArray(int initialCapacity) {
        initialCapacity = 10;
        intArray = new int[initialCapacity];
    }

    public void add (int index, int elem) {
        intArray[index, elem];
        numElems++;
    }

    @Override
    public void toString () {
        for(int i: intArray) {
            System.out.println(intArray[i]);
        }
    }

    public static void main(String[] args) {
        IntArray arr = new IntArray();

    }
}
