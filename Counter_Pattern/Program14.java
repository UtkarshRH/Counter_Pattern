package Counter_Pattern;

public class Program14 {
    public static void main(String args[]) {
        int n = 5;
        int count = 5;
        for (int i = n; i >= 1; i--) {
            int c = count;
            for (int j = i; j >= 1; j--) {
                System.out.print(c + "\t");
                c--;
                ;
            }
            System.out.println();
            count += i - 1;
        }
    }
}