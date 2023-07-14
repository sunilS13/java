import java.util.*;
class evenorodd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String status = number%2==0 ? "is even":"is odd";
        System.out.println(status);
    }
}