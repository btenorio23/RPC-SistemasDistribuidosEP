import java.rmi.*;
import java.rmi.server.*;
public class Implementation extends UnicastRemoteObject implements Hello {
    public Implementation() throws RemoteException {
        super();
    }
    public String sayHello() {
        return "FUNCIONAAAAAAAAAAA!!!!!!!!";
    }
}