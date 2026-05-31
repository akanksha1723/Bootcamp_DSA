import java.util.*;
public class RemoveVowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String result = text.replaceAll("[aeiouAEIOU]","");
        System.out.println(result);
        sc.close();
    }
}
