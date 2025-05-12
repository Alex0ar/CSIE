package acs.ase.ro.main;

import acs.ase.ro.dpcomportamentale.command.restaurant.*;
import acs.ase.ro.dpcomportamentale.observer.youtube.YouTubeChannel;
import acs.ase.ro.dpcomportamentale.observer.youtube.YouTubeSubscriber;
import acs.ase.ro.dpcomportamentale.strategy.calculator.Calculator;
import acs.ase.ro.dpcomportamentale.strategy.calculator.Product;
import acs.ase.ro.dpstructurale.adapter.BusTicketingSystem;
import acs.ase.ro.dpstructurale.adapter.TicketingClassAdapter;
import acs.ase.ro.dpstructurale.adapter.TicketingObjectAdapter;
import acs.ase.ro.dpstructurale.adapter.TrainTicketingSystem;
import acs.ase.ro.dpcomportamentale.chain.comunicatiifirma.ComunicatiiFirmaCallCenter;
import acs.ase.ro.dpcomportamentale.chain.comunicatiifirma.ComunicatiiFirmaManager;
import acs.ase.ro.dpcomportamentale.chain.comunicatiifirma.ComunicatiiFirmaTeamLeader;
import acs.ase.ro.dpstructurale.composite.email.EmailAddress;
import acs.ase.ro.dpstructurale.composite.email.EmailGroup;
import acs.ase.ro.dpstructurale.decorator.car.Car;
import acs.ase.ro.dpstructurale.decorator.car.CarWithAlart;
import acs.ase.ro.dpstructurale.decorator.car.CarWithSportSeats;
import acs.ase.ro.dpstructurale.decorator.car.Vehicul;
import acs.ase.ro.dpstructurale.facade.carsystems.CarFacade;
import acs.ase.ro.dpstructurale.flyweight.CharacterPosition;
import acs.ase.ro.dpstructurale.flyweight.CustomCharacterFactory;
import acs.ase.ro.dpstructurale.flyweight.TextCharacter;
import acs.ase.ro.dpstructurale.proxy.AbstractAuthenticationService;
import acs.ase.ro.dpstructurale.proxy.AuthenticationProtectionProxy;
import acs.ase.ro.dpstructurale.proxy.AuthenticationService;

public class Main {
    public static void main(String[] args) {

        //  ***************
        //  **   CHAIN   **
        //  ***************

        ComunicatiiFirmaTeamLeader comunicatiiTeamLeader = new ComunicatiiFirmaTeamLeader();
        ComunicatiiFirmaCallCenter comunicatiiCallCenter = new ComunicatiiFirmaCallCenter();
        ComunicatiiFirmaManager comunicatiiManager = new ComunicatiiFirmaManager();

        comunicatiiTeamLeader.setNextHandler(comunicatiiCallCenter);
        comunicatiiCallCenter.setNextHandler(comunicatiiManager);

        //comunicatiiTeamLeader.obtineDocument(6);

        //  *****************
        //  **   COMMAND   **
        //  *****************

        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        FoodOrder order1 = new BurgerChickenOrder(chef);
        FoodOrder order2 = new PizzaOrder(chef);
        FoodOrder order3 = new BurgerBeefOrder(chef);

        waiter.addOrder(order1);
        waiter.addOrder(order2);
        waiter.addOrder(order3);

        //waiter.sendOrder();

        //  ******************
        //  **   STRATEGY   **
        //  ******************

        Calculator calculator = new Calculator();
        calculator.setOperation(new Product());
        double result = calculator.compute(1, 2, 2, 3);
        //System.out.println(result);

        calculator.setOperation(numbers -> numbers.stream().mapToInt(n -> n).average().getAsDouble());
        result = calculator.compute(1, 2, 3);
        //System.out.println(result);

        //  ******************
        //  **   OBSERVER   **
        //  ******************

        YouTubeChannel channel = new YouTubeChannel("Recorder");
        YouTubeSubscriber sub1 = new YouTubeSubscriber();
        YouTubeSubscriber sub2 = new YouTubeSubscriber();
        channel.addObserver(sub1);
        channel.addObserver(sub2);

        //channel.uploadVideo("First video on my channel!");
        channel.removeObserver(sub1);
        //channel.uploadVideo("Second video on my channel!");

        //  *****************
        //  **   ADAPTER   **
        //  *****************

        TrainTicketingSystem trainSystem = new TrainTicketingSystem();
        BusTicketingSystem busSystem = new BusTicketingSystem();
        TicketingObjectAdapter objectAdapter = new TicketingObjectAdapter(new BusTicketingSystem());
        TicketingClassAdapter classAdapter = new TicketingClassAdapter();

        //trainSystem.buyTicket(1, 2);
        //busSystem.reserve();

        //System.out.println();
        //objectAdapter.buyTicket(3, 4);
        //classAdapter.buyTicket(2, 3);

        //  ****************
        //  **   FACADE   **
        //  ****************

        CarFacade car = new CarFacade();
//        car.start();
//        System.out.println();
//        car.park();
//        System.out.println();
//        car.emergencyBrake();

        //  ***************
        //  **   PROXY   **
        //  ***************

        AbstractAuthenticationService authenticationService = new AuthenticationService();
        boolean authResult = authenticationService.login("admin", "admin");
        //System.out.println(authResult);

        authenticationService = new AuthenticationProtectionProxy(new AuthenticationService());

        authResult = authenticationService.login("admin", "admin");
        //System.out.println(authResult);

//        for(int i=0;i<5;i++){
//            authenticationService.login("asdf", "asdf");
//        }
        authResult = authenticationService.login("admin", "admin");
        //System.out.println(authResult);

        //  *******************
        //  **   COMPOSITE   **
        //  *******************

        EmailGroup grupa1087 = new EmailGroup();
        EmailGroup seriaC = new EmailGroup();
        seriaC.addReceiver(grupa1087);
        EmailAddress stud1 = new EmailAddress("Ana Lopotenco");
        EmailAddress stud2 = new EmailAddress("Baicu Radu");
        EmailAddress stud3 = new EmailAddress("Ciogoreanu Vlad");
        grupa1087.addReceiver(stud1);
        grupa1087.addReceiver(stud2);
        grupa1087.addReceiver(stud3);

        //seriaC.receive("Inceput de an universitar!");
        //seriaC.display("");

        //  *******************
        //  **   FLYWEIGHT   **
        //  *******************

        CustomCharacterFactory factory = new CustomCharacterFactory();

        TextCharacter char1 = factory.getCharacter('a');
        char1.display(new CharacterPosition(1, 1));

        TextCharacter char2 = factory.getCharacter('b');
        char2.display(new CharacterPosition(1, 2));

        TextCharacter char3 = factory.getCharacter('a');
        char3.display(new CharacterPosition(1, 3));

        //System.out.println(factory.getCharactersCreated());

        //  *******************
        //  **   DECORATOR   **
        //  *******************

        Vehicul car1 = new Car();
        CarWithAlart carWithAlart = new CarWithAlart(car1);
        carWithAlart.activateAlart();
        System.out.println();

        CarWithSportSeats carWithSportSeatsAndAlarm = new CarWithSportSeats(new CarWithAlart(car1));
        carWithSportSeatsAndAlarm.setSeatsProducer("Recaro");
        System.out.println(carWithSportSeatsAndAlarm.getSeatsProducer());
        System.out.println();

        carWithSportSeatsAndAlarm.stop();




    }
}
