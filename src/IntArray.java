public class IntArray {
    int array[];
    int capacity = 10;  //how much space is allocated
    int numElems = 0;  //how many elements added

    public IntArray(int capacity) {
        array = new int[capacity];
    }

}
