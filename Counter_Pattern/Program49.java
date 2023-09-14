package Counter_Pattern;

public class Program49 {
    public static void main(String args[]) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            int c = count;
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print((char) (c + 96));
                c--;
            }
            System.out.println();
            count += i + 1;
        }
    }
}
