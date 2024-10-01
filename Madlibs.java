package madlibs;
import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String madLib = "I went to the animal <noun>, the <plural_noun> and the <number> beasts were there. \n Once upon a time in a <adjective> land, a <noun> <adverb> grew. \n I went to the <place> and bought <number> bottles of <plural_noun>";
        
        while (madLib.indexOf("<") != -1) {
            int start = madLib.indexOf("<");
            int end = madLib.indexOf(">");
            
            if (start != -1 && end != -1 && start < end) {
                String replacer = madLib.substring(start + 1, end); // Find the inside of < >
                System.out.print("Enter a " + replacer + ": ");
                String input = scanner.nextLine(); // Handle input
                
                madLib = madLib.substring(0, start) + input + madLib.substring(end + 1);
            } else {
                break;
            }
        }
        
        System.out.println(madLib); // Final print
    }
}