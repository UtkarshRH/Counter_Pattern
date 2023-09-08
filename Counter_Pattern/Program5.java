package Counter_Pattern;

public class Program5 {
    public static void main(String args[]) {
        int n = 5;
        int count = 1;
        for (int i = n; i >= 1; i--) {
            int c = count;
            for (int j = n; j >= i; j--) {
                System.out.print(c + "\t");
                c += j - 1;
            }
            System.out.println();
            count++;
        }
    }
}
