package Double_Counter;

public class Program3 {
    public static void main(String args[]) {
        int n = 5;
        int count1 = 5;
        int count2 = 1;
        for (int i1 = n, i2 = 1; i1 >= 1 || i2 <= n; i1--, i2++) {
            int c1 = count1;
            int c2 = count2;
            for (int j = i1; j < n; j++) {
                System.out.print("\t");
            }
            for (int j1 = i1, j2 = i2; j1 >= 1 || j2 <= n; j1--, j2++) {
                System.out.print((char) (c1 + 64));
                System.out.print((char) (c2 + 96) + "\t");
                c1--;
                c2 += j2;
            }
            System.out.println();
            count1 += i1 - 1;
            count2 += i2 + 1;
        }
    }
}
