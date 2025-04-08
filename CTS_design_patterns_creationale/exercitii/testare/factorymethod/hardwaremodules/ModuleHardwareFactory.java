package exercitii.testare.factorymethod.hardwaremodules;

import exercitii.testare.factorymethod.contracts.AbstractModuleFactory;
import exercitii.testare.factorymethod.contracts.Module;
import exercitii.testare.factorymethod.ModuleType;

public class ModuleHardwareFactory implements AbstractModuleFactory {
    @Override
    public Module getModule(ModuleType moduleType) {
        switch (moduleType){
            case BATERIESUPLIMENTARA -> {return new ModuleBaterieSuplimentara();}
            case GPSTRACKER -> {return new ModuleGpsTracker();}
            default -> throw new IllegalArgumentException();
        }
    }
}
