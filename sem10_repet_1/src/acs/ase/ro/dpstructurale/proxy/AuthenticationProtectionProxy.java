package acs.ase.ro.dpstructurale.proxy;

public class AuthenticationProtectionProxy implements AbstractAuthenticationService{
    private AbstractAuthenticationService authenticationService;
    private int noOfFailedAttempts = 0;

    public AuthenticationProtectionProxy(AbstractAuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @Override
    public boolean login(String username, String password) {
        if(noOfFailedAttempts > 4) {
            return false;
        }
        boolean isAuthenticationSuccessful =authenticationService.login(username, password);
        if(isAuthenticationSuccessful){
            noOfFailedAttempts = 0;
            return true;
        } else {
            System.out.println("Wrong password!");
            noOfFailedAttempts++;
            return false;
        }
    }
}
