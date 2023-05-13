import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket= new ServerSocket(12345);
            Socket socket= serverSocket.accept();
            System.out.println("new server added");

            OutputStream outputStream= socket.getOutputStream();
            PrintWriter printWriter= new PrintWriter(outputStream,true);

            Scanner scanner= new Scanner(System.in);
            while (true) {
                String get = scanner.nextLine();
                printWriter.println(get);
            }
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}