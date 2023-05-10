// Видеоурок здесь: https://lms.synergy.ru/learning/view/68493
// Задание здесь: https://lms.synergy.ru/lntools/mcresource/view/67098/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Task2_3_7 {

    public static void main(String[] args) {
        System.out.println("Задание: \n7.\tвыведите каждую третью букву латинского алфавита\n\nРешение: ");
        for (int i = 99; i<=122; i = i + 3) {
            System.out.print((char)i + ", ");
        }
    }
}