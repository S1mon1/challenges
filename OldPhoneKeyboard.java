import java.util.HashMap;
import java.util.Scanner;

public class Old_Phone_Keyboard {
    public static void main(String[] args)
    {
        HashMap<String, String> mapp = new HashMap<>();
        mapp.put("A", "2");
        mapp.put("B", "22");
        mapp.put("C", "222");
        mapp.put("D", "3");
        mapp.put("E", "33");
        mapp.put("F", "333");
        mapp.put("G", "4");
        mapp.put("H", "44");
        mapp.put("I", "444");
        mapp.put("J", "5");
        mapp.put("K", "55");
        mapp.put("L", "555");
        mapp.put("M", "6");
        mapp.put("N", "66");
        mapp.put("O", "666");
        mapp.put("P", "7");
        mapp.put("Q", "77");
        mapp.put("R", "777");
        mapp.put("S", "7777");
        mapp.put("T", "8");
        mapp.put("U", "88");
        mapp.put("V", "888");
        mapp.put("W", "9");
        mapp.put("X", "99");
        mapp.put("Y", "999");
        mapp.put("Z", "9999");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String odp = scanner.nextLine();
        System.out.println(encode(odp, mapp));
        scanner.close();

    }

    static public String encode(String word, HashMap map)
    {
        String new_word = "";
        for(int i = 0; i < word.length(); i++)
        {
            new_word += map.get((Character.toString(word.charAt(i))).toUpperCase());
        }
        return new_word;
    }
}
