package Counter_Pattern;

public class Program6 {
    public static void main(String args[]) {
        int n = 5;
        int count = 5;
        for (int i = n; i >= 1; i--) {
            int c = count;
            for (int j = n; j >= i; j--) {
                System.out.print(c + "\t");
                c += j;
            }
            System.out.println();
            count--;
        }
    }
}