package exercitii.testare.simplefactory;

public class RestApiFactory {
    public RestApi getRestApi(ModuleType moduleType){
        switch (moduleType){
            case GPSTRACKER -> {return new ModuleGpsTracker();}
            case VEDERETIMPDENOAPTE -> {return new ModuleVedereTimpDeNoapte();}
            case BATERIESUPLIMENTARA -> {return new ModuleBaterieSuplimentara();}
            default -> throw new IllegalArgumentException();
        }
    }
}
