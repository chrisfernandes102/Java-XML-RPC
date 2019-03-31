import helma.xmlrpc.WebServer;

// Description : Get message from client, and display it on the screen
public class JavaServer {

    public static void main(String[] args) {
        try {
            System.out.println("Start XML-RPC Server...");
            WebServer webServer = new WebServer(8080);
            webServer.addHandler("myServer", new JavaServer());
            webServer.start();

            System.out.println("Started successfully.");
        } catch (Exception exception) {
            System.err.println("Server : " + exception);
        }
    }

    // Method to get Message (String) from client
    public String pesanClient(String pesan) {
        System.out.println(pesan);
        return "Client message displayed";
    }
}