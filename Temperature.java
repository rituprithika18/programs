public class Temperature
{
    double temp;//instance variable 
    Temperature()
    {
        temp=92;
    }
    Temperature(double t)
    {
        temp=t;
    }
    double convert_to_celcius()
    {
        double cel=(5.0/9)*(temp-32);
        return cel;
    }
    public double getTemp()
    {
      return temp;
    }
}
  
    
    
