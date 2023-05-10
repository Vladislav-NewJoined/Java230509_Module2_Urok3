// Видеоурок здесь: https://lms.synergy.ru/learning/view/68493
// Задание здесь: https://lms.synergy.ru/lntools/mcresource/view/67098/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Task2_3_4 {

    public static void main(String[] args) {
        System.out.println("Задание: \n4.\tвыведите десять букв в алфавите после буквы й\n\nРешение: ");

        // Находим код буквы й (1081)
//        char ch = 'й';
//        int chCode = (int) ch;
//        System.out.println(chCode);

        for (int i = 1081 + 1; i<=1081 + 1 + 9; i++) {
            System.out.print((char)i + ", ");
        }
        System.out.println();
    }
}