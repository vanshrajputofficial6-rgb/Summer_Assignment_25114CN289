//Write a program to Find longest word.
class Ques_3{
    public static String longestWord(String str){
        String[] words = str.split("[^a-zA-Z0-9]+");
        String longword = "";
        for(String word : words){
            if(word.length() > longword.length()){
                longword = word;
            }
        }
        return longword;
    } 
    public static void main(String[]args){
        String str = "Shaheed Bharat Tiwari Ji Amar Rahein.";
        System.out.println("Longest word in the sentence is: " + longestWord(str));
    }
}