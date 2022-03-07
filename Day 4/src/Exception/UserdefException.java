package Exception;
class UserException extends Exception
{    public UserException()
{    System.out.println("Divide by zero exception");
}
}
public class UserdefException {
    public static void main(String[] args) {
        int a,b;
        a=10; b=0;
        try
        {    if(b==0)
            throw new UserException();
        else
            System.out.println("Q"+a/b);
        }
        catch(Exception e)
        {
        }
    }
}
