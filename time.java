class time
{
    int hrs,mins;
    
    void input(int h,int m)//parameters
    {
        hrs=h;
        mins=m;
    }
    void add_time(time obj1,time obj2)//to add time
    {
        int total_mins=obj1.hrs*60+obj1.mins+obj2.hrs+obj2.mins;
        hrs=total_mins/60;
        mins=total_mins%60;
    }
    void display()//display method
    {
        System.out.println("Total Time="+hrs+"hrs"+mins+"mins");
    }
    public static void main()
    {
        time t1=new time();
        time t2=new time();
        time t3=new time();
        t1.input(6,45);
        t2.input(2,30);
        t3.add_time(t1,t2);
        t3.display();
    }
}
        
        