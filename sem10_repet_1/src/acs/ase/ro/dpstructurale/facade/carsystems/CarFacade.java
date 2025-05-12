package acs.ase.ro.dpstructurale.facade.carsystems;

public class CarFacade {
    BreakingSystem breakingSystem = new BreakingSystem();
    LightingSystem lightingSystem = new LightingSystem();
    Engine engine = new Engine();

    public void start() {
        System.out.println("Car starting!");
        breakingSystem.releaseAllBreaks();
        engine.startEngine();
        lightingSystem.turnOnLowBeam();
    }

    public void park() {
        System.out.println("Car parked!");
        breakingSystem.applyRearBreak();
        engine.stopEngine();
        lightingSystem.turnOffAllLights();
    }

    public void emergencyBrake() {
        System.out.println("Emergency break applied!");
        breakingSystem.applyFrontBreak();
        breakingSystem.applyRearBreak();
        engine.stopEngine();
        lightingSystem.turnOnBrakeLights();
        lightingSystem.turnOnHazardLights();
    }
}
