
class accountdetails
{
    public static void main()
    {
        account my_account=new account();
        my_account.startAccount(100000);
        my_account.deposit(250.000);//deposit money
        //print current balance
        System.out.println("current balance"+my_account.get_balance());
        my_account.withdraw(800.00);//withdraw money
        //pritn remaining balance
        System.out.println("remaining balance"+my_account.get_balance());
    }
}

