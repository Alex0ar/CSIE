package acs.ase.ro.dpcomportamentale.chain.comunicatiifirma;

import java.util.List;

public class ComunicatiiFirmaCallCenter extends ComunicatiiFirmaHandler{
    protected List<Integer> niveleSecuritateAcces = List.of(1, 2, 3);

    @Override
    public void obtineDocument(int nivelSecuritate) {
        if(niveleSecuritateAcces.contains(nivelSecuritate)){
            System.out.println("Agentul de la call center a inregistrat cererea dvs. si va emite imediat documentul necesar. Va multumim!");
        } else {
            if(nextHandler != null){
                nextHandler.obtineDocument(nivelSecuritate);
            }
        }
    }
}
