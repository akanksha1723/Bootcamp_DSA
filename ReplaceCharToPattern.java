import java.util.*;
public class ReplaceCharToPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String targets = sc.next();
        String symbol = sc.next();
        String regex = "[" + targets + "]";
        String result = word.replaceAll(regex,symbol);
        System.out.println(result);
        sc.close();
    }
}
