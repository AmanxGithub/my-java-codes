class Info
{
    int rollnum;
    static String college="IIITB";
    public Info(int r)
    {
        rollnum=r;
    }

}
public class Student {

    public static void main(String args[])
    {
        Info a=new Info(2);
        Info b=new Info(5);
        System.out.println(a.rollnum+""+a.college);
        System.out.println(b.rollnum+""+b.college);

    }
}