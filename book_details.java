public class book_details
{
    public static void main()
    {
        book obj1=new book();
        book obj2=new book();
        book obj3=new book();
        obj1.book1("maze_runner","rr98d",300.0);
        System.out.println("book 1");
        System.out.println("title:"+obj1.To_get_title());
         System.out.println("code:"+obj1.To_get_code());
         System.out.println("price:"+obj1.To_get_price());
         System.out.println("book 2");
         obj2.book1("Hunger_Games","ajinjam",350.0);
         System.out.println("title:"+obj2.To_get_title());
         System.out.println("code:"+obj2.To_get_code());
         System.out.println("price:"+obj2.To_get_price());
         System.out.println("book 3");
         obj2.book1("Sherlock_Holmes","vavahvcyk",400.0);
         System.out.println("title:"+obj2.To_get_title());
         System.out.println("code:"+obj2.To_get_code());
         System.out.println("price:"+obj2.To_get_price());
         
         
    }
}

