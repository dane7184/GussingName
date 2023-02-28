import java.util.Scanner;

public class Gussing {
    public static void main(String[] args) {
        String name;
        int num =0,sum=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please input your name : ");//my name is : lim dane
        name=scanner.nextLine().toLowerCase();
        for (int i=0; i<name.length(); i++){
            switch (name.charAt(i)){
                case 'a', 'j', 's' -> num += 1;
                case 'b', 'k', 't' -> num += 2;
                case 'c', 'l', 'u' -> num += 3;
                case 'd', 'm', 'v' -> num += 4;
                case 'e', 'n', 'w' -> num += 5;
                case 'f', 'o', 'x' -> num += 6;
                case 'g', 'p', 'y' -> num += 7;
                case 'h', 'q', 'z' -> num += 8;
                case 'i', 'r' -> num += 9;
                default -> num +=0;
            }
        }
        /*  lim dane
        d+a+n+e+l+i+m;
        4+1+5+5+3+9+4=31
        3+1=(4) is a result
         */
        if (num>10) {
            char[] chars = String.valueOf(num).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                sum = sum + Character.getNumericValue(chars[i]);
            }
            System.out.println("The Number of your name is : " + sum);
        }
    }
}
