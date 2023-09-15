package Double_Counter;

public class Program4 {
    public static void main(String args[]) {
        int n = 5;
        int count1 = 5;
        int count2 = 5;
        for (int i = n; i >= 1; i--) {
            int c1 = count1;
            int c2 = count2;
            for (int j1 = i, j2 = n; j1 <= n || j2 >= i; j1++, j2--) {
                System.out.print((char) (c1 + 64));
                System.out.print((char) (c2 + 96) + "\t");
                c1 -= j1 + 1;
                c2 += j2;
            }
            System.out.println();
            count1 += i - 1;
            count2--;
        }
    }
}
