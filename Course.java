package bulletins;

import java.util.ArrayList;
import java.util.Iterator;

public class Course {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add("ar");
        myList.add("bh");
        myList.add("us");
        myList.add("nu");
        myList.add("rm");

        Iterator<String> it = myList.iterator();
        while (it.hasNext()) {
            String value = it.next();
            if (value.equals("bh"))
                myList.remove(value);
        }

    }
}
