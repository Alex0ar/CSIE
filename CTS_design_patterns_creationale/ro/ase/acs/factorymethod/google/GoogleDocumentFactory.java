package ro.ase.acs.factorymethod.google;

import ro.ase.acs.factorymethod.DocumentType;
import ro.ase.acs.factorymethod.contracts.AbstractDocumentFactory;
import ro.ase.acs.factorymethod.contracts.Document;
import ro.ase.acs.factorymethod.exceptions.NoSuchDocument;

public class GoogleDocumentFactory implements AbstractDocumentFactory {

    @Override
    public Document getDocument(DocumentType documentType) {
        switch (documentType){
            case TEXT -> {return new GoogleDocument();}
            case SPREDSHEET -> {return new GoogleSheetDocument();}
            case PRESENTATION -> {return new GoogleSlidesDocument();}
            default -> throw new NoSuchDocument();
        }
    }
}
