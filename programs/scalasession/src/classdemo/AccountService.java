package classdemo;


public class AccountService {
    // static variable instance of type Singleton
    private static AccountService instance = null;

    // variable of type String
    public String name;

    // private constructor restricted to this class itself
    private AccountService() {
        name = "Hello I am a string part of Singleton class";
    }
    public int getRemaingAmountFor(String accountId){

        //A database call

        return  0;
    }

    // static method to create instance of Singleton class
    public static AccountService getInstance() {
        if (instance == null)
            instance = new AccountService();

        return instance;
    }
}