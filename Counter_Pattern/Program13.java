package Counter_Pattern;

public class Program13 {
    public static void main(String args[]) {
        int n = 5;
        int count = (n * (n + 1)) / 2;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(count + "\t");
                count--;
            }
            System.out.println();
        }
    }
}
