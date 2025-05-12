package acs.ase.ro.dpcomportamentale.chain.comunicatiifirma;

import java.util.List;

public class ComunicatiiFirmaManager extends ComunicatiiFirmaHandler{
    private List<Integer> niveleSecuritateAcces = List.of(1, 2, 3, 4, 5, 6);

    @Override
    public void obtineDocument(int nivelSecuritate) {
        if(niveleSecuritateAcces.contains(nivelSecuritate)){
            System.out.println("Managerul a inregistrat cererea dvs. si va emite imediat documentul necesar. Va multumim");
        } else {
            if(nextHandler != null){
                nextHandler.obtineDocument(nivelSecuritate);
            }
        }
    }
}
