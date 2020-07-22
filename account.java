class account
{
    double balance;
    account()//default construct
    {
         balance=0;
    }
    void startAccount(double amt)
    {
        balance=amt;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    double withdraw(double amount)
    {
        balance-=amount;
        return amount;
    }
    double get_balance()
    {
        return balance;//current balance is returned
  
    }
}

    
        


    
        
    
    
    