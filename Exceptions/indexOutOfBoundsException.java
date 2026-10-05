package Exceptions;

public class indexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(arr[11]);
    }
}

/**
 * InnerindexOutOfBoundsException
 */
class fixedIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        try {
            System.out.println(arr[11]);
        } catch (Exception e) {
            System.err.println("Error occured: " + e);
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}