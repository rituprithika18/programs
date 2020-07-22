public class library
{
    String title;
    int acc_num;
    String author;
    int days,fine;
    void input(String title_book,String author_name,int accession_number)//taking input data
    {
        title=title_book;
        acc_num=accession_number;
        author=author_name;
    }
    public void compute(int no_of_days)
    {
        days=no_of_days;
        
        fine=2*days;
        System.out.println("fine charged="+fine);
    }
    public void display()
    {
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(acc_num+"\t"+title+"\t"+author);
    }
    public static void main(String args[])
    {
        library obj1=new library();
        obj1.input("Maze Runner","James Dashner",85100000);
        obj1.compute(4);
        obj1.display();
        
    }
}

        
        
        
    