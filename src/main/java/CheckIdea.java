/**
 * Created by Gregory on 10.02.2016.
 */
public class CheckIdea {
    public static void main(String[] args) {
        int i = 0;


        for (; ; ) {
            System.out.println(Integer.toString(1 + (int) (Math.random() * 15)));
            i++;
            if (i == 10) {
                break;
            }

        }

    }
}
