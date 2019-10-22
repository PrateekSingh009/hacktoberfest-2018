import java.util.*;
class stringrev
{
    static String revs="";
    public static void main(String ar[])
    {   Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),ss;
        ss=function(" "+s);
        System.out.print(revs);
    }
    public static String function(String s)
    {
        revs=revs+s.charAt(s.length()-1);
        if(s.equals(" "))
        return " ";
        else
        return (function(s.substring(0,s.length()-1)));
    }
}
