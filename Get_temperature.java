class Get_temperature
{
    public static void main()
    {
    Temperature daytemp=new Temperature(94);//first obj
    System.out.println("Temperature in Fahrenheit is:"+daytemp.getTemp());
    System.out.println("Temperature in celcius is :"+daytemp.getTemp());
    Get_temperature dTemp=new Get_temperature();//second obj
    System.out.println("other Temperature in fahrenheit is:"+daytemp.getTemp());
    System.out.println("other Temperature in celcius is :"+daytemp.convert_to_celcius());
  }
}
