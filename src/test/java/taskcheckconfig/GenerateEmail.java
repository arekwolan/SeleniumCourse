package taskcheckconfig;

public class GenerateEmail {
    public static String withTimestamp() {
        String currentTs = Long.toString(System.currentTimeMillis());
        return "dzejdablju+" + currentTs + "@gmail.com";
    }
}