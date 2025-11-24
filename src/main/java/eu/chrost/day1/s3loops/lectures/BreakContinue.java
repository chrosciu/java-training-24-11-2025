package eu.chrost.day1.s3loops.lectures;

public class BreakContinue {
    public static void main(String[] args) {
        int i = 1;

        while (true) { 
            System.out.println(i++);

            //"reczne" wyjscie z petli za pomoca instrukcji break
            if (i > 10) {
                break;
            }
        }

        int j = 1;

        while (j <= 10) {
            if (j == 7) {
                j++;
                //wyskocz z petli i zacznij od razu kolejna iteracje
                continue;
            }
            System.out.println(j++);
        }

        int k = 0;
        while (++k <= 10) {
            if (k == 7) {
                continue;
            }
            System.out.println(k);
        }
    }    
}
