public class Singleton 
{
    private static Singleton instance;//object
    private String message;

    private Singleton() //constructor
    {
        // private constructor to prevent other classes from creating instances
        message = "Hello, Singleton!";
    }

    public static synchronized Singleton getInstance()
     {//return single object
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }
    
    public class SingletonPatternExample 
{
    Singleton singleton = Singleton.getInstance();
System.out.println(singleton.getMessage()); // output: "Hello, Singleton!"

Singleton anotherSingleton = Singleton.getInstance();
System.out.println(anotherSingleton.getMessage()); // output: "Hello, Singleton!"

System.out.println(singleton == anotherSingleton); // output: "true"

}
