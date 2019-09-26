package FrontTimes;

/**
 * Given a string and a non-negative int n, we'll say that the front
 * of the string is the first 3 chars, or whatever is there if the
 * string is less than length 3. Return n copies of the front;
 *
 * Input : frontTimes("Chocolate", 2)
 * Output : ChoCho
 *
 * Input : frontTimes("Chocolate", 3)
 * Output : ChoChoCho
 *
 * Input : frontTimes("Abc", 3)
 * Output : AbcAbcAbc
 *
 * @author: Siva Sankar
 */

public class FrontTimes {

    /**
     * This method returns n copies of the front.
     * @param str, the string to be considered.
     * @param n, the non-negative integer value.
     * @return the n copies of the front string.
     */
    public static String frontTimes(String str, int n) {
        if (str.length() == 0 || n == 0)
            return "";
        else if (str.length() < 3){
            String temp = "";
            while(n > 0){
                temp += str;
                n--;
            }
            return temp;
        }
        else{
            String temp = "";
            while(n > 0){
                temp += str.substring(0,3);
                n--;
            }
            return temp;
        }
    }
}
