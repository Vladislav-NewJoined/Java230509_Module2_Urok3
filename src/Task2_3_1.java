public class Task2_3_1 {

    public static void main(String[] args) {
        System.out.println("Задание: \n1.\tВыведите числа от двух в десятой степени до десяти в четвертой степени\n\nРешение: ");

        int numBasis = 2;
        int numExponent = 10;
        int result = (int) Math.pow(numBasis, numExponent);

        int numBasis2 = 10;
        int numExponent2 = 4;
        int result2 = (int) Math.pow(numBasis2, numExponent2);

        for (int i = result; i <= result2; i++) {
            System.out.println(i);
        }
    }
}
