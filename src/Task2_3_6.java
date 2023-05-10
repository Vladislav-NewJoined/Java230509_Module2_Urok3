// Видеоурок здесь: https://lms.synergy.ru/learning/view/68493
// Задание здесь: https://lms.synergy.ru/lntools/mcresource/view/67098/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Task2_3_6 {

    public static void main(String[] args) {
        System.out.println("Задание: \n6.\tвыведите каждую вторую букву алфавита (а, в, д)\n\nРешение: ");

        /*Коды букв Кириллицы: 1072 - 1103*/
        for (int i = 1072; i<=1103; i = i + 2) {
            System.out.print((char)i + ", ");
        }
//        char ch = 'а';
//        int chCode = (int) ch;
//        System.out.println(chCode);
    }
}