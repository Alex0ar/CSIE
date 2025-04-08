package ro.ase.acs.factorymethod.microsoft;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;
import ro.ase.acs.factorymethod.exceptions.NoSuchDocument;

public class MicrosoftDocumentFactory implements AbstractDocumentFactory {
    @Override
    public Document getDocument(DocumentType documentType) {
        switch (documentType){
            case TEXT -> {return new WordDocument();}
            case SPREDSHEET -> {return new ExcelDocument();}
            case PRESENTATION -> {return new PowerPointDocument();}
            default -> throw new NoSuchDocument();
        }
    }
}
