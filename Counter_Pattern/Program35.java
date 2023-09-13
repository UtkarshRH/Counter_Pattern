package Counter_Pattern;

public class Program35 {
    public static void main(String arsg[]) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 1; j--) {
                System.out.print("\t");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }
}
