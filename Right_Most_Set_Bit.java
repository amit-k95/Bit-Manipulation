import java.util.*;

public class Right_Most_Set_Bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rsbm = n & -n;
        System.out.println(Integer.toBinaryString(rsbm));
    }
}