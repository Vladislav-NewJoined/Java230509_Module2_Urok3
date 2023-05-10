import java.io.*;

// Видеоурок здесь: https://lms.synergy.ru/learning/view/68493
// Задание здесь: https://lms.synergy.ru/lntools/mcresource/view/67098/?groupPeriodId=1045153&disciplineVersionId=25858&start=1
public class Task2_3_9 {

    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n9.\tВыведите в файл list.html список :\n" +
                "<ul>\n" +
                "<\tli> 1 element </li>\n" +
                "<\tli> 2 element </li>\n" +
                "<\tli> 100 element </li>\n" +
                "</ul>\n\nРешение: ");
        File file = new File("src\\list.html");
        file.createNewFile();
        String xStr;
        for (int x = 1; x <= 100; x++) {
            xStr = String.valueOf(x);
            String html = "<ul><li>" + xStr + " element </li></ul>";

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                bw.write(html);
                bw.flush();

                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Шаг 1: файл создан по адресу: src\\list.html");
        System.out.println("Шаг 1: заданный список записан в файл list.html");
    }
}
