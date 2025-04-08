package ro.ase.acs.simplefactory;

public class RestApiFactoryV2 {
    public RestApi getRestApi(ServerType serverType){
        switch (serverType){
            case PRODUCTION -> {return new RestApiProduction();}
            case DEVELOPMENT -> {return new RestApiDevelopment();}
            default -> throw new IllegalArgumentException();
        }
    }
}
