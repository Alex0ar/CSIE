package exercitii.testare.singletonregistry;

public abstract class AbstractMicroService {
    protected String ServiceName;
    protected String ServiceUrl;

    public AbstractMicroService(String serviceName, String serviceUrl) {
        ServiceName = serviceName;
        ServiceUrl = serviceUrl;
    }

    public abstract void connect();
}
