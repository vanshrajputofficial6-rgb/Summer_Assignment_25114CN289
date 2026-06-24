//Write a program a to Compress a string.
class Ques_2{
    public static String compression(String str){
        String s = str.charAt(0) + "";
        int count = 1;

        for(int i=1; i<str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                s += count;
                count = 1;
                }
            s += curr;
            }
        }
        return s;
    } 
    public static void main(String[]args){
        String str = "aaabbccaeef";
        System.out.println("String: " + str);
        System.out.println("Compressed string: " + compression(str));
    }
}