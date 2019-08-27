package inheritanceDemo;
abstract class ImportantItems{
    public abstract void  salt();
    public void water()
    {
        System.out.println("I am must item for better taste");
    }
    public void oil()
    {
        System.out.println("Use me but in less quantity");
    }

}
class vegItems extends ImportantItems
{

    public void salt()
    {
        System.out.println("You need me must in almost all itmes");
    }
    public void vegetable()

    {
        System.out.println("If you use me will be very healthy");
    }
}

class Nonveg extends ImportantItems
{
    public void salt()
    {
        System.out.println("I am must item for better taste");
    }
    public void Nonvegitem()
    {
        System.out.println("I am very healthy when cooked in proper way and eat in less quantity");
    }
}

public class MultilevelInhritancee {
    public static void main(String args[])
    {
        vegItems imp= new vegItems ();

        Nonveg imp1= new Nonveg();
        imp.salt();
        imp.vegetable();
        imp.oil();
        imp.water();
        imp1.Nonvegitem();
        imp1.salt();
        imp1.oil();
        imp1.water();

    }
}
