package acs.ase.ro.dpcomportamentale.chain.comunicatiifirma;

import java.util.List;

public class ComunicatiiFirmaTeamLeader extends ComunicatiiFirmaHandler{
    private List<Integer> niveleSecuritateAcces = List.of(1);

    @Override
    public void obtineDocument(int nivelSecuritate) {
        if(niveleSecuritateAcces.contains(nivelSecuritate)){
            System.out.println("Team Leader-ul a inregistrat cererea dvs. si va emite imediat documentul necesar. Va multumim");
        } else {
            if(nextHandler != null){
                nextHandler.obtineDocument(nivelSecuritate);
            }
        }
    }
}
