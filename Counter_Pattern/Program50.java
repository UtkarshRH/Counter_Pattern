package Counter_Pattern;

public class Program50 {
    public static void main(String args[]) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            int c = count;
            for (int j = i; j <= n; j++) {
                System.out.print((char) (c + 64));
                c += j + 1;
            }
            System.out.println();
            count += i;
        }
    }
}
