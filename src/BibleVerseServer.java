import helma.xmlrpc.WebServer;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Description : Get message from client, and display it on the screen
public class BibleVerseServer {

    public static void main(String[] args) {
        try {
            System.out.println("Start XML-RPC Server...");
            WebServer webServer = new WebServer(8080);
            webServer.addHandler("myServer", new BibleVerseServer());
            webServer.start();

            System.out.println("Started successfully.");
        } catch (Exception exception) {
            System.err.println("Server : " + exception);
        }
    }

    // Method to get Message (String) from client
    public String searchVerse(String pesan) throws FileNotFoundException {
        System.out.println(pesan);

        String verse = null;

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("bible.json"));

            JSONObject jsonObject = (JSONObject) obj;

            verse = (String) jsonObject.get(pesan);
            System.out.println(verse);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }
        return verse;
    }
}