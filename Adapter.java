public interface Target 
{
   void request();
}
public class Adaptee {
   public void specificRequest() {
      System.out.println("Specific request from Adaptee.");
   }
}

public class Adapter implements Target {
   private Adaptee adaptee;

   public Adapter(Adaptee adaptee) {
      this.adaptee = adaptee;
   }

   @Override
   public void request() {
      adaptee.specificRequest();
   }
}
public static void main(String[] args) 
{
   Adaptee adaptee = new Adaptee();
   Target adapter = new Adapter(adaptee);

   adapter.request();
}


