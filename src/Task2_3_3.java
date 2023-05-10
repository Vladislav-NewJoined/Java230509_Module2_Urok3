// Видеоурок здесь: https://lms.synergy.ru/learning/view/68493
// Задание здесь: https://lms.synergy.ru/lntools/mcresource/view/67098/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Task2_3_3 {

    public static void main(String[] args) {
        System.out.println("Задание: \n3.\tВыведите буквы от а до я (подсказка: for (char letter=’a’; letter ’я’; letter++) )\n\nРешение: ");

        /*инфо с примером решения здесь: https://www.cyberforum.ru/java-j2se/thread423856.html*/

        for(char letter = 'а';letter<='ю';letter++) {
            System.out.print(letter + ", ");
        }

        for(char letter = 'я';letter =='я';letter++) {
            System.out.print(letter + " ");
        }

        System.out.println();
    }
}