package Excercises;

public class SeriesCalculator {
    public int calculateSum(int n) {
        int a = 1, d = 2;
        return (n * (2 * a + (n - 1) * d)) / 2;
    }
    public static void main(String[] args) {
        SeriesCalculator myObj = new SeriesCalculator();
        int sum = myObj.calculateSum(5);
        System.out.println(sum);
    }
}
