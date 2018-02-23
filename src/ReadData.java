import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadData {
    public static void main(String[] args){
        File file = new File("Test.txt");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        String b = scan.next();
        String c = scan.nextLine();

        System.out.println(a + b + c );
    }
}
