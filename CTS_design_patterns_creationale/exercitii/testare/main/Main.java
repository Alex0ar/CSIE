package exercitii.testare.main;

import exercitii.testare.factorymethod.ModuleType;
import exercitii.testare.factorymethod.contracts.AbstractModuleFactory;
import exercitii.testare.factorymethod.contracts.Module;
import exercitii.testare.factorymethod.hardwaremodules.ModuleHardwareFactory;
import exercitii.testare.factorymethod.softwaremodules.ModuleSoftwareFactory;
import exercitii.testare.simplefactory.ModuleVedereTimpDeNoapte;
import exercitii.testare.simplefactory.RestApi;
import exercitii.testare.simplefactory.RestApiFactory;
import exercitii.testare.singleton.DroneConnection;
import exercitii.testare.singletonregistry.AbstractMicroService;
import exercitii.testare.singletonregistry.SingletonRegistry;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // ** EX1 **
//        DroneConnection user1 = DroneConnection.INSTANCE;
//        user1.connect();
//        user1.isConnected();
//        user1.disconnect();
//        user1.isConnected();
//
//        DroneConnection user2 = DroneConnection.INSTANCE;
//        user2.connect();
//        user2.isConnected();
//        user1.isConnected();
//
//        System.out.println(user1.hashCode() + " | " + user2.hashCode());
//        System.out.println(user1 == user2);

//        SingletonRegistry registry = new SingletonRegistry();
//        AbstractMicroService service = registry.getSingleton(SingletonRegistry.ServiciuUtilizator.class.getSimpleName());
//        service.connect();
//        service = registry.getSingleton(SingletonRegistry.ServiciuDateFabricatie.class.getSimpleName());
//        service.connect();
//        service = registry.getSingleton(SingletonRegistry.ServiciuDateMeteo.class.getSimpleName());
//        service.connect();

//        RestApiFactory factory = new RestApiFactory();
//        RestApi modul = factory.getRestApi(ModuleType.BATERIESUPLIMENTARA);
//        modul.connect();
//        modul = factory.getRestApi(ModuleType.GPSTRACKER);
//        modul.connect();
//        modul = factory.getRestApi(ModuleType.VEDERETIMPDENOAPTE);
//        modul.connect();

        AbstractModuleFactory factory = new ModuleHardwareFactory();
        Module module = factory.getModule(ModuleType.GPSTRACKER);
        module.connect();
        module = factory.getModule(ModuleType.BATERIESUPLIMENTARA);
        module.connect();
        factory = new ModuleSoftwareFactory();
        module = factory.getModule(ModuleType.VEDERETIMPDENOAPTE);
        module.connect();




    }
}
