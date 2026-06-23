//Write a program to Find first non-repeating character.
import java.util.LinkedHashMap;
import java.util.Map;
class Ques_1{
    public static Character firstnonrepeatingchar(String str){
        if(str == null || str.isEmpty()){
            return null;
        }

        Map<Character, Integer> charCounts = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : charCounts.entrySet()){
            if (entry.getValue() == 1){
            return entry.getKey();
            }
        }
        return null;
    }
    
    public static void main(String[]args){
        String str = "abcbba";
        Character result = firstnonrepeatingchar(str);

        if(result != null){
            System.out.println("The first non repeating character is " + result);
        }else{
            System.out.println("No non repeating charcter found");            
        }
    }
}