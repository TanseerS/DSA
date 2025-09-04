public class DiamondStar {
    public static void main(String[] args) {
        int n = 3;
        printDiamond(n);
    }

    static void printDiamond(int n) {
        // top half (including middle row)
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s <= n - row; s++) System.out.print(" ");
            for (int st = 1; st <= 2 * row - 1; st++) System.out.print("*");
            System.out.println();
        }
        // bottom half
        for (int row = n - 1; row >= 1; row--) {
            for (int s = 1; s <= n - row; s++) System.out.print(" ");
            for (int st = 1; st <= 2 * row - 1; st++) System.out.print("*");
            System.out.println();
        }
    }
}
