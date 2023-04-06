public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 12;
        int c = 12;
        int d = 12;
        int sumOne = a + b;
        int sumTwo = c + d;

        System.out.println("Перше порівняння: " +
                "\nСума1:" + sumOne +
                "\nСума2:" + sumTwo +
                "\n" + (sumOne > sumTwo ? true : false));

        sumOne = sumOne + 1;
        sumTwo = sumTwo - 2;

        System.out.println("Друге порівняння: " +
                "\nСума1:" + sumOne +
                "\nСума2:" + sumTwo +
                "\n" + (sumOne > sumTwo ? true : false));

        System.out.println("Третє порівняння:" +
                "\n" + ((sumOne % 2 == 0 || sumTwo % 2 == 0) ? true : false));
    }
}
