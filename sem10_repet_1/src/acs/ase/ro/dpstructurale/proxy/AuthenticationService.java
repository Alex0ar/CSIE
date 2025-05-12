package acs.ase.ro.dpstructurale.proxy;

public class AuthenticationService implements AbstractAuthenticationService{
    public static final String ADMIN_USERNAME = "admin";
    public static final String ADMIN_PASSWORD = "admin";

    @Override
    public boolean login(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }
}
