import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String host = "";
        int port = 6666;
        Socket socket = null;
        host = "127.0.0.1";
        try
        {
            socket = new Socket( host, port );
            DataInputStream input = null;
            DataOutputStream output = null;
            
            try
            {	
            	
                input = new DataInputStream( socket.getInputStream() );
                output = new DataOutputStream( socket.getOutputStream() );
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                //output.writeUTF("Áý­¹");
                output.writeUTF("exit");
                System.out.print(in.readLine());
                output.flush();
                output.close();
            }
            catch ( IOException e )
            {
            }
            finally 
            {
                if ( input != null )
                    input.close();
                if ( output != null )
                    output.close();
            }
        }
        catch ( IOException e )
        {
            e.printStackTrace();
        }
        finally
        {
            if ( socket != null )
                socket.close();
           
        }
    }
}

