import java.rmi.*;
public class Client {
    public static void main(String args[]) {
        //Cria e instala o security manager
        //    System.setSecurityManager (new RMISecurityManager () );
        try {
            
            Hello obj = (Hello) Naming.lookup("rmi://192.168.0.30:2001/HelloServer");
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            System.out.println("HelloClient erro" + e.getMessage());
        }
        System.exit(0);
    }
}