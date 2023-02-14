import java.util.Scanner;

public class Phong {
    public static void main(String[] args){
        int x;
        int y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập x : ");
        x = scanner.nextInt();
        System.out.print("Nhập y : ");
        y = scanner.nextInt();
        double c = x + y ;
        System.out.println(x + "+" + y + "=" + c);
    }
}
