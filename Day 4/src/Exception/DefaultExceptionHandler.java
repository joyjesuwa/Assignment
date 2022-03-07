package Exception;

public class DefaultExceptionHandler {
    public static void main(String[] args) {
        String name = null; // Exception
        try {
            System.out.println(name.length());
        } catch (NullPointerException e)
        {
            System.out.println("Value not yet initialized");
        }
        }
    }


//public class DefaultExceptionHandler {
  //  public static void main(String[] args) {
    //    String name = null; // Exception
//    System.out.println(name.length());

      //  }
    //}