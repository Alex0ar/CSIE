package exercitii.testare.singletonregistry;

import java.util.HashMap;
import java.util.Map;

public class SingletonRegistry {
    private static Map<String, Object> registry = new HashMap<>();

    static{
        registry.put(ServiciuUtilizator.class.getSimpleName(), new ServiciuUtilizator("ServiciuUtilizator", "http//:ServiciuUtilizator"));
        registry.put(ServiciuDateMeteo.class.getSimpleName(), new ServiciuDateMeteo("ServiciuDateMeteo", "http//:ServiciuDateMeteo"));
        registry.put(ServiciuDateFabricatie.class.getSimpleName(), new ServiciuDateFabricatie("ServiciuDateFabricatie", "http//:ServiciuDateFabricatie"));
    }

    public <T> T getSingleton(String className){
        return (T)registry.get(className);
    }

    public static class ServiciuUtilizator extends AbstractMicroService {
        public ServiciuUtilizator(String serviceName, String serviceUrl) {
            super(serviceName, serviceUrl);
        }

        @Override
        public void connect() {
            System.out.println("Conectare la serviciu utilizator");
        }
    }

    public static class ServiciuDateMeteo extends AbstractMicroService{
        public ServiciuDateMeteo(String serviceName, String serviceUrl) {
            super(serviceName, serviceUrl);
        }

        @Override
        public void connect() {
            System.out.println("Conectare la serviciu date meteo");
        }
    }

    public static class ServiciuDateFabricatie extends AbstractMicroService{
        public ServiciuDateFabricatie(String serviceName, String serviceUrl) {
            super(serviceName, serviceUrl);
        }

        @Override
        public void connect() {
            System.out.println("Conectare la serviciu date fabricatie");
        }
    }
}
