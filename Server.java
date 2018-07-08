
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class Server {
    public static void main(String args[]) {
        //Cria e instala o security manager
        //System.setSecurityManager(new RMISecurityManager() );
        try {
            //Cria HelloImpl
            //Runtime.getRuntime().exec("rmiregistry 1010");
            //Registry registry = LocateRegistry.getRegistry(2001);
        	System.setProperty("java.rmi.server.hostname","192.168.0.30");
            Registry registry = LocateRegistry.createRegistry(2001);
            Implementation obj = new Implementation();
            registry.bind("HelloServer", obj);
            System.out.println("Hello Server pronto.");
        } catch (Exception e) {
            System.out.println("HelloServer erro " + e.getMessage());
        }
    }
}