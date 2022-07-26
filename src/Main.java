public class Main {
    public static void main(String[] args) {
        int i = 2;
        while (i < 100) {
            if (soNguyenTo(i)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    public static boolean soNguyenTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}



