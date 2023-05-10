// Видеоурок здесь: https://lms.synergy.ru/learning/view/68493
// Задание здесь: https://lms.synergy.ru/lntools/mcresource/view/67098/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Task2_3_5 {

    public static void main(String[] args) {
        System.out.println("Задание: \n5.\tвыведите десять букв в алфавите, идущие до буквы ю\n\nРешение: ");

        // Находим код буквы ю
        /*char ch = 'ю';
        int chCode = (int) ch;
        System.out.println(chCode);*/

        for (int i = 1101-9; i<=1101; i++) {
            System.out.print((char)i + ", ");
        }
        System.out.println();
    }
}