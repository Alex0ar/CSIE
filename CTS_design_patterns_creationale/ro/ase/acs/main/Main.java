package ro.ase.acs.main;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;
import ro.ase.acs.factorymethod.google.GoogleDocumentFactory;
import ro.ase.acs.factorymethod.microsoft.MicrosoftDocumentFactory;
import ro.ase.acs.simplefactory.RestApi;
import ro.ase.acs.simplefactory.RestApiFactory;
import ro.ase.acs.simplefactory.RestApiFactoryV2;
import ro.ase.acs.simplefactory.ServerType;
import ro.ase.acs.singleton.Logger;
import ro.ase.acs.singleton.LoggerV2;
import ro.ase.acs.singleton.LoggerV3;
import ro.ase.acs.singletonergistry.SingletonRegistry;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
//        System.out.println("---- Logger ----");
//        Logger logger = Logger.getInstance();
//        Logger logger1 = Logger.getInstance();
//        logger.log("Fatal error");
//        logger.log("Unrecognized error");
//
//        System.out.println("---- LoggerV2 ----");
//        LoggerV2 loggerV2 = LoggerV2.instance;
//        LoggerV2 logger1V2 = LoggerV2.instance;
//        loggerV2.log("Fatal error loggerV2");
//        LoggerV2.instance.log("Unrecognized error loggerV2");
//
//        System.out.println("---- LoggerV3 ----");
//        LoggerV3 loggerV3 = LoggerV3.INSTANCE;
//        LoggerV3 logger3V3 = LoggerV3.INSTANCE;
//        loggerV3.log("Fatal error loggerV3");
//        LoggerV3.INSTANCE.log("Unrecognized error loggerV3");
//
//        System.out.println("---- VERIFICARE EGALITATE ----");
//        System.out.println("V1 sunt egali: " + (logger == logger1));
//        System.out.println("V2 sunt egali: " + (logger1V2 == loggerV2));
//        System.out.println("V3 sunt egali: " + (logger3V3 == loggerV3));

//        RestApiFactory restApiFactory = new RestApiFactory();
//        RestApi restApi = restApiFactory.getRestApi("development");
//        restApi.connect();
//        restApi = restApiFactory.getRestApi("production");
//        restApi.connect();

//        RestApiFactoryV2 restApiFactory = new RestApiFactoryV2();
//        RestApi restApi = restApiFactory.getRestApi(ServerType.DEVELOPMENT);
//        restApi.connect();
//        restApi = restApiFactory.getRestApi(ServerType.PRODUCTION);
//        restApi.connect();

//        SingletonRegistry singletonRegistry = new SingletonRegistry();
//        SingletonRegistry.Logger logger = singletonRegistry.getSingleton(SingletonRegistry.Logger.class.getSimpleName());
//        logger.Log("First log");
//        SingletonRegistry.DatabaseConnection databaseConnection = singletonRegistry.getSingleton(SingletonRegistry.DatabaseConnection.class.getSimpleName());
//        databaseConnection.connect();
//
//        SingletonRegistry.Logger logger1 = singletonRegistry.getSingleton(SingletonRegistry.Logger.class.getSimpleName());
//        if(logger1 == logger)
//            System.out.println("logger == logger1");
//        SingletonRegistry.DatabaseConnection databaseConnection1 = singletonRegistry.getSingleton(SingletonRegistry.DatabaseConnection.class.getSimpleName());
//        if(databaseConnection1 == databaseConnection)
//            System.out.println("databaseConnection == databaseConnection1");
//        System.out.println("Hash codurile:");
//        System.out.println(databaseConnection1.hashCode());
//        System.out.println(databaseConnection.hashCode());

        AbstractDocumentFactory factory = new GoogleDocumentFactory();
        Document document = factory.getDocument(DocumentType.PRESENTATION);
        document.setName("g presentation");
        document.open();
        document = factory.getDocument(DocumentType.SPREDSHEET);
        document.setName("g sheet");
        document.open();
        document = factory.getDocument(DocumentType.TEXT);
        document.setName("g doc");
        document.open();

        factory = new MicrosoftDocumentFactory();
        document = factory.getDocument(DocumentType.PRESENTATION);
        document.setName("m presentation");
        document.open();
        document = factory.getDocument(DocumentType.SPREDSHEET);
        document.setName("m sheet");
        document.open();
        document = factory.getDocument(DocumentType.TEXT);
        document.setName("m doc");
        document.open();



    }
}
