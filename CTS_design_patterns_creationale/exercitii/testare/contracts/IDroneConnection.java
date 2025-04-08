package exercitii.testare.contracts;

public interface IDroneConnection {
    void connect();
    void disconnect();
    boolean isConnected();
}
