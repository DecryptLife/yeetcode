import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> ana = new HashMap<>();

        for(String str:strs)
        {
            char[] anagram_char = str.toCharArray();
            Arrays.sort(anagram_char);
            String anagram = String.valueOf(anagram_char);

            if(ana.containsKey(anagram))
            {
                List<String> list = new ArrayList<>();
                list = ana.get(anagram);
                list.add(str);
                ana.put(anagram,list);
            }
            else
            {
                List<String> list = new ArrayList<>();

                list.add(str);

                ana.put(anagram,list);
            }
        }

        List<List<String>> res = new ArrayList<>();

        ana.forEach((k,v)->res.add(v));

        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> result = groupAnagrams(strs);

        for(List<String> res: result)
            System.out.println(res);

    }
}
