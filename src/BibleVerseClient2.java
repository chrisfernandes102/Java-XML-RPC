import helma.xmlrpc.XmlRpcClient;
import java.util.Scanner;
import java.util.Vector;


public class BibleVerseClient2 {
    public static void main(String[] args) {
        try {
            // connect server
            XmlRpcClient server = new XmlRpcClient("http://localhost:8080/RPCclient");
            Vector params = new Vector();

            Scanner scan = new Scanner(System.in);
            while (true) {
                System.out.print("Message to Server : ");
                String pesan = scan.nextLine();
                params.addElement(pesan);
                // send message to server
                Object result = server.execute("myServer.pesanClient", params);
                System.out.println(result);
                params.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
