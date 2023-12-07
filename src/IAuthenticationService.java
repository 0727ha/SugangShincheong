// IAuthenticationService.java
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAuthenticationService extends Remote {
    boolean authenticate(String userId, char[] password) throws RemoteException;
}
