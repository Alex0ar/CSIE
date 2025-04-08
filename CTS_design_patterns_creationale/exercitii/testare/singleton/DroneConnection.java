package exercitii.testare.singleton;

import exercitii.testare.contracts.IDroneConnection;

public enum DroneConnection implements IDroneConnection {
    INSTANCE;

    private boolean isConnected = false;

    @Override
    public void connect() {
        System.out.println("User is connecting to the drone");
        isConnected = true;
    }

    @Override
    public void disconnect() {
        System.out.println("User is disconnecting from the drone");
        isConnected = false;
    }

    @Override
    public boolean isConnected() {
        if (isConnected) {
            System.out.println("User is connected to the drone");
            return true;
        } else {
            System.out.println("User is not connected to the drone");
            return false;
        }
    }
}
