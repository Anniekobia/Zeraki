import java.util.Scanner;

public class ReverseString {

    public static String reversedString="";

    public static String reverseString(String s){
        if(s.length()>4){
            for (int i=1;i<=s.length()+1;i++){
                if (i%4==0){
                    String substring = s.substring((i-4),(i));
                    StringBuilder sb=new StringBuilder(substring);
                    reversedString =reversedString + sb.reverse().toString();
                }
            }
        }
        else {
            StringBuilder sb = new StringBuilder(s);
            reversedString = sb.reverse().toString();
        }
        System.out.println(reversedString);
        return reversedString;
    }


    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String: ");
        String s = scanner.nextLine();
        reverseString(s);
    }
}
