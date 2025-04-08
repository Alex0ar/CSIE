package exercitii.testare.factorymethod.contracts;

import exercitii.testare.factorymethod.ModuleType;

public interface AbstractModuleFactory {
    Module getModule(ModuleType moduleType);
}
