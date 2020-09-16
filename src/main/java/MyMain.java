import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int a = Integer.parseInt(binary); 
        int c = 0;
        int x = 0;
        int sum = 0;
        while (a > 0) {
            int lastdigit = a % 10;
            x = (int)(Math.pow(2,c) * lastdigit);
            sum = sum + x;
            c++;
            a /= 10; 
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format: ");
        String name = scan.next();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(name));

        scan.close();
    }
}
