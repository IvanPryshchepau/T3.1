
/**
 * Created by ivanpryshchepau on 6/22/16.
 */
public class _Runner {

    public static void main(String[] args) {
        try {
            System.out.println(checker(args[0]));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nothing to check");
        }

    }

    public static boolean checker(String num) {

        if (num.length() != 4) {
            System.out.println("Not four-digit number");
            return false;
        }

        if (Integer.parseInt(num.substring(0, 1)) * Integer.parseInt(num.substring(1, 2)) ==
                Integer.parseInt(num.substring(2, 3)) * Integer.parseInt(num.substring(3, 4))) {
            return true;
        } else {
            return false;
        }

    }

}
