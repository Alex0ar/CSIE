package acs.ase.ro.dpcomportamentale.chain.comunicatiifirma;

public abstract class ComunicatiiFirmaHandler {
    public ComunicatiiFirmaHandler nextHandler;

    public void setNextHandler(ComunicatiiFirmaHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void obtineDocument(int nivelSecuritate);
}
