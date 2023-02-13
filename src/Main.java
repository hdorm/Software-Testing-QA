public class Main {
    public static void main(String[] args) {

        Library testOne = new Library();
        System.out.println(testOne.computeTax(new double[]{5000}, new int[]{55, 55}, new int[]{9}));

        Library testTwo = new Library();
        System.out.println(testTwo.computeTax(new double[]{60000}, new int[]{55, 55, 55}, new int[]{9, 9, 9}));

        Library testThree = new Library();
        System.out.println(testThree.computeTax(new double[]{100000}, new int[]{}, new int[]{}));

        Library testFour = new Library();
        System.out.println(testFour.computeTax(new double[]{140000}, new int[]{55}, new int[]{9}));
    }
}