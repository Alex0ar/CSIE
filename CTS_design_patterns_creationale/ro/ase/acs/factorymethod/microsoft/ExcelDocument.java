package ro.ase.acs.factorymethod.microsoft;

import ro.ase.acs.factorymethod.contracts.AbstractDocument;
import ro.ase.acs.factorymethod.contracts.Document;

public class ExcelDocument extends AbstractDocument {
    ExcelDocument(){}

    @Override
    public void open() {
        System.out.println("Opening Excel document: " + name);
    }
}
