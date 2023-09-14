package Double_Counter;

public class Program1 {
    public static void main(String args[]) {
        int n = 5;
        int count = (n * (n + 1)) / 2;
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            int c = count;
            int d = counter;
            for (int j = i; j <= n; j++) {
                System.out.print((char) (c + 64));
                System.out.print((char) (d + 96) + "\t");
                c -= j;
                d += j;
            }
            System.out.println();
            count -= i + 1;
            counter += i + 1;
        }
    }
}
