package javafxapplication.Tools;


public class UrlService {
    private static String URL="http://localhost:8080";

    public String GetServerUrl(String path) {
        return URL + path;
    }
}
