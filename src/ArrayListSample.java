import java.util.ArrayList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("foo");

        int i = list.indexOf("def"); //Sends you the index num of where that's at (it uses is.equals to check for that)

    }

}
