import java.util.Comparator;

public class Sort implements Comparator<Integer> {

    /**
     * Compares its two arguments for order.  Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal
     * to, or greater than the second.
     *
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return a negative integer, zero, or a positive integer as the
     * first argument is less than, equal to, or greater than the
     * second.
     * @throws NullPointerException if an argument is null and this
     *                              comparator does not permit null arguments
     * @throws ClassCastException   if the arguments' types prevent them from
     *                              being compared by this comparator.
     */
    @Override
    public int compare(Integer o1, Integer o2) {

        int i;
        if (o1>o2) {
            i = 0;
        }else if (o1<o2){
            i = 1;
        }else {
            i = -1;
        }
        return i;
    }
}