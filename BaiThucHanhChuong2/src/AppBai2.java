import java.util.Scanner;
public class AppBai2 {
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("So ban vua nhap la: ");
    n = sc.nextInt();
    if (n % 2 == 0) {
        System.out.println(n + " la so chan");
    } else {
        System.out.println(n + " la so le");
    }
    sc.close();
    }
}