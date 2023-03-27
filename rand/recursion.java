public class recursion {

    public static int recurs(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * recurs(n - 1);
    }

    public static int factorielle(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * factorielle(n - 1);
    }

    public static int size(int[] x, int i) {
        if (i == x.length) {
            return 1;
        }
        return 1 + size(x, i++);
    }

    public static void main(String[] args) {
        System.out.println(recurs(3));
        System.out.println(factorielle(5));
        int[] x = { 1, 2, 3, 4, 5 };
        System.out.println(size(x, 0));
    }
}