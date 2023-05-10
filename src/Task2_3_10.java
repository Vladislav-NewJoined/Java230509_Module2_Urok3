import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Курс валют скачивается отсюда, API Центробанка: https://cbr.ru/scripts/XML_dynamic.asp?date_req1=31/03/2023&date_req2=31/03/2023&VAL_NM_RQ=R01235
public class Task2_3_10 {

    public static void main(String[] args) throws IOException {
     System.out.println("Задание: \n10.\tВыведите курс валют за 1 число каждого месяца в 2014 году\n\nРешение: ");
        for (int month = 1; month <= 12; month = month + 1) {
            String monthStr = (month < 10) ? ("0" + month) : String.valueOf(month);
            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/01/2014&date_req2=01/" + monthStr + "/2014&VAL_NM_RQ=R01235";
            String page1 = downloadWebPage(url);
            if (page1.contains("<Value>")) {
                int startIndex1 = page1.lastIndexOf("<Value>");
                int endIndex1 = page1.lastIndexOf("</Value>");
                String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
                System.out.println("01/" + monthStr + "/2014" + ": " + courseStr1);
            } else {
                System.out.println("01/" + monthStr + "/2014" + ": ");
            }
        }
    }

    private static String downloadWebPage (String url) throws IOException {
        StringBuilder result = new StringBuilder();
        String line;
        URLConnection urlConnection = new URL(url).openConnection();
        try (InputStream is = urlConnection.getInputStream();
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }
}
