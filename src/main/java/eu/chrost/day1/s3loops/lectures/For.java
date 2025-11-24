package eu.chrost.day1.s3loops.lectures;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int j = 1; j <= 10; ) {
            System.out.println(j++);
        }

        for (int k = 1; ; ++k) {
            if (k > 10) {
                break;
            }
            System.out.println(k);
        }

        for (int m = 1; ;) {
            if (m > 10) {
                break;
            }
            System.out.println(m++);
        }

        int n = 1;
        for (; ;) {
            if (n > 10) {
                break;
            }
            System.out.println(n++);
        }
    }
}
