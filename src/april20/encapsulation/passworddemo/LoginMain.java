package april20.encapsulation.passworddemo;

public class LoginMain {
    public static void main(String[] args) {

        LoginUser loginUser = new LoginUser("pragra" ,"pragra123"); // currrent username & password
        // loginUser.isUserAuthenticated("pragra" ,"pragra123"); // at the time of login


        loginUser.isUserAuthenticated("pragra", "MyPassword");

        // reset password.

        String userName = loginUser.getUserName();
        System.out.println("My Username "+ userName);
        loginUser.setPassword("Phone");

        loginUser.isUserAuthenticated("pragra", "Phone");


    }
}
