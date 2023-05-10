import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// Курс валют скачивается отсюда, API Центробанка: https://cbr.ru/scripts/XML_dynamic.asp?date_req1=31/03/2023&date_req2=31/03/2023&VAL_NM_RQ=R01235
public class Task2_3_11 {

    public static void main(String[] args) throws IOException {
        System.out.println("Задание: \n11.\tВыведите курс валют за 1 февраля каждого года с 1994 до текущего года\n\nРешение: ");
        for (int year = 1994; year <= 2023; year = year + 1) {
            String url = "https://cbr.ru/scripts/XML_dynamic.asp?date_req1=01/02/1994&date_req2=01/02/" + year + "&VAL_NM_RQ=R01235";
            String page1 = downloadWebPage(url);
            if (page1.contains("<Value>")) {
                int startIndex1 = page1.lastIndexOf("<Value>");
                int endIndex1 = page1.lastIndexOf("</Value>");
                String courseStr1 = page1.substring(startIndex1 + 7, endIndex1);
                System.out.println("01/02/" + year + ": " + courseStr1);
            } else {
                System.out.println("01/02/" + year + ": ");
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
