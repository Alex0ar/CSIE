package ro.ase.acs.simplefactory;

public class RestApiFactory {
    public static final String DEVELOPMENT = "development";

    public RestApi getRestApi(String ServerType){
        if(DEVELOPMENT.equals(ServerType)){
            return new RestApiDevelopment();
        }
        else if("production".equals(ServerType)){
            return new RestApiProduction();
        }
        else{
            return null;
        }
    }
}
