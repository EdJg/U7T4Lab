import java.util.ArrayList;

public class Runner
{
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");

// before:
        System.out.println(names);

// complete code below to traverse the arraylist and insert "HELLO" after any
// name that contains the letter "i"
        for (int index = 0; index < names.size(); index ++)
        {
            if (names.get(index).indexOf("i") != -1)
            {
                names.add(index + 1, "HELLO");
                index ++;
            }
        }

// after:
        System.out.println(names);

        /////////////////

        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("Jessica");
        names2.add("Emily");
        names2.add("Destiny");
        names2.add("Mateo");
        names2.add("Sofia");
        names2.add("Tim");
        names2.add("James");

// before:
        System.out.println(names2);

// complete code below to traverse the arraylist and remove all
// names that are exactly 5 letters long
        for (int index = 0; index < names2.size(); index ++)
        {
            if (names2.get(index).length() == 5)
            {
                names2.remove(index);
                index --;
            }
        }

// after:
        System.out.println(names2);
    }
}
